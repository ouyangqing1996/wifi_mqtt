package com.zhupp.ems.service;

import com.zhupp.ems.dto.UserDto;
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
        List<UserDto> list= userMapper.getUserList();
        return list;
    }

    /**
     * 解除禁用用户
     *
     * @param userDto
     */
    public void unforbidUser(UserDto userDto) {
        userDto.setUserStatus("0");
        userDto.setUserUpdateDate(new Date());
        userMapper.updateUser(userDto);
    }

    /**
     * 禁用用户
     *
     * @param userDto
     */
    public void forbidUser(UserDto userDto) {
        userDto.setUserStatus("1");
        userDto.setUserUpdateDate(new Date());
        userMapper.updateUser(userDto);
    }

    /**
     * 更改用户名
     */
    public void rename(UserDto userDto) {
        userDto.setUserUpdateDate(new Date());
        userMapper.updateUser(userDto);
    }

    /**
     * 更改密码
     */
    public void repassword(UserDto userDto) {
        userDto.setUserUpdateDate(new Date());
        userMapper.updateUser(userDto);
    }

    /**
     * 获取密码
     */
    public void getPassword(UserDto userDto) {
        String password = userMapper.getPasswordByUserID(userDto.getUserID());
        userDto.setUserPassword(password);
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
