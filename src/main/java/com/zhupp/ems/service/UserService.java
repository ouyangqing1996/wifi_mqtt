package com.zhupp.ems.service;

import com.zhupp.ems.dao.UserMapper;
import com.zhupp.ems.dto.UserDto;
import com.zhupp.ems.util.po.User;
import com.zhupp.ems.util.po.UserExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 获取用户列表
     *
     * @return
     */


    public List getUserList() {
        UserExample example = new UserExample();
        example.createCriteria().andEmsUserIdIsNotNull();
        List<User> list = userMapper.selectByExample(example); //modified by oyq
        return list;
    }

    /**
     * 解除禁用用户
     *
     * @param user
     */
    public void unforbidUser(User user) {
        user.setEmsUserStatus("0");
        user.setEmsUserUpdateTime(new Date());
        UserExample example = new UserExample();
        example.createCriteria().andEmsUserIdEqualTo(user.getEmsUserId());
        userMapper.updateByExampleSelective(user,example);
    }

    /**
     * 禁用用户
     *
     * @param user
     */
    public void forbidUser(User user) {
        user.setEmsUserStatus("1");
        user.setEmsUserUpdateTime(new Date());
        UserExample example = new UserExample();
        example.createCriteria().andEmsUserIdEqualTo(user.getEmsUserId());
        userMapper.updateByExample(user,example);
    }

    /**
     * 更改用户名
     */
    public void rename(User user) {
        user.setEmsUserUpdateTime(new Date());
        UserExample example = new UserExample();
        example.createCriteria().andEmsUserIdEqualTo(user.getEmsUserId());
        userMapper.updateByExample(user,example);

    }

    /**
     * 更改密码
     */
    public void repassword(User user) {
        user.setEmsUserUpdateTime(new Date());
        UserExample example = new UserExample();
        example.createCriteria().andEmsUserIdEqualTo(user.getEmsUserId());
        userMapper.updateByExample(user,example);
    }

    /**
     * 获取密码
     */
    public void getPassword(User user) {
        user.setEmsUserUpdateTime(new Date());
        UserExample example = new UserExample();
        example.createCriteria().andEmsUserIdEqualTo(user.getEmsUserId());
        List<User> users = userMapper.selectByExample(example);
        String password1 = users.get(0).getEmsUserPassword();
        user.setEmsUserPassword(password1);
    }


    public int register(String phone,String passwd ,String userName){
        String sql = "insert into ems_user values((null,?,?,'1',current_timestamp(),current_timestamp(),?)";
        return jdbcTemplate.update(sql, phone, passwd, userName);
    }

    public boolean isExist(String phone){
        String sql = "select ems_user_id from ems_user where ems_user_id=?";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql, phone);
        if(list!=null){
            if(list.size()>0){
                return true;
            }
        }
        return false;
    }

}
