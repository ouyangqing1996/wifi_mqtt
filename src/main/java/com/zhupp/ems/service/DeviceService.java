package com.zhupp.ems.service;

import com.github.pagehelper.PageHelper;
import com.zhupp.ems.dto.DataDto;
import com.zhupp.ems.dto.DeviceDto;
import com.zhupp.ems.dto.DeviceListDto;
import com.zhupp.ems.dto.PageQueryParam;
import com.zhupp.ems.util.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class DeviceService {

    @Autowired
    private DeviceMapper deviceMapper;
    @Autowired
    private DataMapper dataMapper;

    /**
     * 根据账号查所有的设备
     *
     * @param UserID
     * @return
     */

    public List getDeviceListByUserID(String UserID) {
        List<DeviceDto> deviceList = deviceMapper.getDeviceListByUserID(UserID);
        return deviceList;

    }

    /**
     * 更新设备数据
     *
     * @param deviceDto
     */
    public void updateDeviceByDeviceId(DeviceDto deviceDto) {
        deviceDto.setDeviceUpdateDate(new Date());
        int result = deviceMapper.updateDeviceByDeviceId(deviceDto);
    }

    /**
     * 批量删除设备
     *
     * @param deviceListDto
     */
    public void deleteDeviceList(DeviceListDto deviceListDto) {
        int result = deviceMapper.deleteDeviceList(deviceListDto.getList());
    }

    /**
     * 获取设备数据（分页查询）
     * @param pageQueryParam
     * @return
     */
    public PageBean<DataDto> getDeviceData(PageQueryParam<String> pageQueryParam) {
        PageHelper.startPage(pageQueryParam.getPageNo(), pageQueryParam.getPageSize());
        List<DataDto> list = dataMapper.getDataListByDeviceId(pageQueryParam.getParam());
        return new PageBean(list);
    }

    public void storeData(DataDto dataDto) {
       int result= dataMapper.addData(dataDto);
    }
}
