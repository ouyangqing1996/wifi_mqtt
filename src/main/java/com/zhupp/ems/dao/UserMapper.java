package com.zhupp.ems.dao;

import com.zhupp.ems.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserMapper {

    String  getPasswordByUserID(@Param("userID") String userID);

    List<UserDto> getUserList();

    int  updateUser(@Param("userDto")UserDto userDto);
}
