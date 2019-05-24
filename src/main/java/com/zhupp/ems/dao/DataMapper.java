package com.zhupp.ems.dao;

import com.zhupp.ems.dto.DataDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DataMapper {

    List<DataDto>  getDataListByDeviceId(@Param("deviceId") String deviceId);

    int addData(@Param("dataDto")DataDto dataDto);
}
