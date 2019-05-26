package com.zhupp.ems.service;

import com.github.pagehelper.PageHelper;
import com.zhupp.ems.dao.DataMapper;
import com.zhupp.ems.dao.DeviceMapper;
import com.zhupp.ems.util.po.*;
import com.zhupp.ems.util.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        DeviceExample example = new DeviceExample();
        example.createCriteria().andEmsDeviceUserIdEqualTo(UserID);
        List<Device> deviceList = deviceMapper.selectByExample(example);
        return deviceList;
    }

    /**
     * 更新设备数据
     *
     * @param
     */
    public void updateDeviceByDeviceId(Device device) {
        device.setEmsDeviceUpdateTime(new Date());
        DeviceExample example = new DeviceExample();
        example.createCriteria().andEmsDeviceInfoIdEqualTo(device.getEmsDeviceInfoId());
        int result = deviceMapper.updateByExampleSelective(device,example);
    }

    /**
     * 批量删除设备
     *
     * @param
     */
    public void deleteDeviceList(List<Device> deviceList) {
        List deviceIdlist=new ArrayList<Long>();
        for (Device device : deviceList) {
            Long id = device.getEmsDeviceInfoId();
            deviceIdlist.add(id);
        }
        DeviceExample example = new DeviceExample();
        example.createCriteria().andEmsDeviceInfoIdIn(deviceIdlist);
        int result = deviceMapper.deleteByExample(example);
    }

    /**
     * 获取设备数据（分页查询）
     *
     * @param pageQueryParam
     * @return
     */
    public PageBean<Data> getDeviceData(PageQueryParam<String> pageQueryParam) {
        DataExample example = new DataExample();
        example.createCriteria().andEmsDataDeviceIdEqualTo(pageQueryParam.getParam());
        PageHelper.startPage(pageQueryParam.getPageNo(), pageQueryParam.getPageSize());
        List<Data> list = dataMapper.selectByExample(example);
        return new PageBean(list);
    }

    public void storeData(Data data) {
        int result = dataMapper.insert(data);
    }
}
