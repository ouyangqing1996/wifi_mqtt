package com.zhupp.ems.dao;

import com.zhupp.ems.dto.DeviceDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface DeviceMapper {

    List<DeviceDto> getDeviceListByUserID(@Param("userID") String userID);

    int  updateDeviceByDeviceId(@Param("deviceDto")DeviceDto deviceDto);

    int deleteDeviceList(@Param("deviceDtos") List<DeviceDto> deviceDtos);
}
