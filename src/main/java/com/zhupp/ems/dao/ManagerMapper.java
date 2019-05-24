package com.zhupp.ems.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


@Mapper
public interface ManagerMapper {

    String getPasswordByUserID(@Param("userID") String userID);

}
