package com.zhupp.ems.service;

import com.zhupp.ems.dto.UserDto;
import com.zhupp.ems.dao.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserMapper userMapper;

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
}
