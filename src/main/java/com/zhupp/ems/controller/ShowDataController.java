package com.zhupp.ems.controller;

import com.alibaba.fastjson.JSON;
import com.zhupp.ems.dto.*;
import com.zhupp.ems.service.DeviceService;
import com.zhupp.ems.service.UserService;
import com.zhupp.ems.util.*;
import com.zhupp.ems.util.po.Data;
import com.zhupp.ems.util.po.Device;
import com.zhupp.ems.util.po.PageQueryParam;
import com.zhupp.ems.util.po.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * 数据展示模块
 * 根据用户展示所拥有的设备
 */

@RestController
@Slf4j
@RequestMapping("/ems/show")
public class ShowDataController {

    @Autowired
    private DeviceService deviceService;
    @Autowired
    private UserService userService;

    /**
     * 展示用户设备
     *
     * @param
     * @return
     */
    @PostMapping(value = "/device/list")
    public Result getDeviceList(@RequestBody User user) {
        log.info("获取用户设备:" + JSON.toJSONString(user));
        List<Device> deviceList = deviceService.getDeviceListByUserID(user.getEmsUserId());
        return new Result(deviceList);
    }
    /**
     * 更改用户名
     */
    @PostMapping(value = "/rename")
    public Result rename(@RequestBody User user) {
        log.info("更改用户名："+ JSON.toJSONString(user));
        userService.rename(user);
        return new Result();
    }
    /**
     * 更改密码
     */
    @PostMapping(value = "/repassword")
    public Result repassword(@RequestBody User user) {
        log.info("更改密码："+ JSON.toJSONString(user));
        userService.repassword(user);
        return new Result();
    }
    /**
     * 获取密码
     */
    @PostMapping(value = "/getpassword")
    public Result getPassword(@RequestBody User user) {
        log.info("获取密码："+ JSON.toJSONString(user));
        userService.getPassword(user);
        return new Result(user);
    }
    /**
     * 添加设备
     * 尚未实现，必须有硬件支持
     */
    @PostMapping(value = "/device/add")
    public Result addDevice(@RequestBody Device device) {
        log.info("添加设备："+ JSON.toJSONString(device));
//        deviceService.insert(device);
        return new Result();
    }

    /**
     * 更新设备
     */
    @PostMapping(value = "/device/update")
    public Result updateDevice(@RequestBody Device device) {
        log.info("更新设备："+ JSON.toJSONString(device));
        deviceService.updateDeviceByDeviceId(device);
        return new Result();
    }

    /**
     * 删除设备
     */
    @PostMapping(value = "/device/delete")
    public Result deleteDeviceList(@RequestBody List<Device> deviceList) {
        log.info("删除设备："+ JSON.toJSONString(deviceList));
        deviceService.deleteDeviceList(deviceList);
        return new Result();

    }

    /**
     * 根据设备id展示数据
     * 数据很庞大，分页查询
     * 后期可以考虑mycat分库分表（高级）
     */
    @PostMapping(value = "/device/data")
    public Result getDeviceData(@RequestBody PageQueryParam<String> pageQueryParam) {
        log.info("获取数据："+JSON.toJSONString(pageQueryParam));
       PageBean<Data> pageBean= deviceService.getDeviceData(pageQueryParam);
        return new Result(pageBean);
    }

}
