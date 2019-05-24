package com.zhupp.ems.controller;

import com.alibaba.fastjson.JSON;
import com.zhupp.ems.dto.*;
import com.zhupp.ems.service.DeviceService;
import com.zhupp.ems.service.UserService;
import com.zhupp.ems.util.*;
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
    public Result getDeviceList(@RequestBody UserDto userDto) {
        log.info("获取用户设备:" + JSON.toJSONString(userDto));
        List<DeviceDto> deviceList = deviceService.getDeviceListByUserID(userDto.getUserID());
        return new Result(deviceList);
    }
    /**
     * 更改用户名
     */
    @PostMapping(value = "/rename")
    public Result rename(@RequestBody UserDto userDto) {
        log.info("更改用户名："+ JSON.toJSONString(userDto));
        userService.rename(userDto);
        return new Result();
    }
    /**
     * 更改密码
     */
    @PostMapping(value = "/repassword")
    public Result repassword(@RequestBody UserDto userDto) {
        log.info("更改密码："+ JSON.toJSONString(userDto));
        userService.repassword(userDto);
        return new Result();
    }
    /**
     * 获取密码
     */
    @PostMapping(value = "/getpassword")
    public Result getPassword(@RequestBody UserDto userDto) {
        log.info("获取密码："+ JSON.toJSONString(userDto));
        userService.getPassword(userDto);
        return new Result(userDto);
    }
    /**
     * 添加设备
     * 尚未实现，必须有硬件支持
     */
    @PostMapping(value = "/device/add")
    public Result addDevice(@RequestBody DeviceDto deviceDto) {
        log.info("添加设备："+ JSON.toJSONString(deviceDto));
//        deviceService.insert(deviceDto);
        return new Result();
    }

    /**
     * 更新设备
     */
    @PostMapping(value = "/device/update")
    public Result updateDevice(@RequestBody DeviceDto deviceDto) {
        log.info("更新设备："+ JSON.toJSONString(deviceDto));
        deviceService.updateDeviceByDeviceId(deviceDto);
        return new Result();
    }

    /**
     * 删除设备
     */
    @PostMapping(value = "/device/delete")
    public Result deleteDeviceList(@RequestBody DeviceListDto deviceListDto) {
        log.info("删除设备："+ JSON.toJSONString(deviceListDto));
        deviceService.deleteDeviceList(deviceListDto);
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
       PageBean<DataDto> pageBean= deviceService.getDeviceData(pageQueryParam);
        return new Result(pageBean);
    }

}
