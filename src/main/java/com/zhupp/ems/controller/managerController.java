package com.zhupp.ems.controller;

import com.alibaba.fastjson.JSON;
import com.zhupp.ems.service.DeviceService;
import com.zhupp.ems.service.UserService;
import com.zhupp.ems.util.Result;
import com.zhupp.ems.util.ResultEnum;
import com.zhupp.ems.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/ems/manager")
/**
 * 管理模块
 */
public class managerController {


    @Autowired
    private UserService userService;
    @Autowired
    private DeviceService deviceService;

    /**
     * 管理员禁用用户
     */
    @PostMapping(value = "/forbid")
    public Result forbidUser(@RequestBody UserDto userDto) {
        log.info("禁用用户:"+ JSON.toJSONString(userDto));
        userService.forbidUser(userDto);
        return new Result(ResultEnum.SUCCESS);

    }

    /**
     * 管理员解除禁用
     *
     * @param userDto
     * @return
     */
    @PostMapping(value = "/unforbid")
    public Result unforbidUser(@RequestBody UserDto userDto) {
        log.info("解除禁用用户:"+ JSON.toJSONString(userDto));
        userService.unforbidUser(userDto);
        return new Result(ResultEnum.SUCCESS);

    }

    /**
     * 管理员展示用户列表
     *
     * @param
     * @return
     */
    @PostMapping(value = "/manager/list")
    public Result getUserList(@RequestBody UserDto userDto) {
        log.info("获取用户列表:"+ JSON.toJSONString(userDto));
        List<UserDto> userList = userService.getUserList();
        return new Result(userList);
    }

    /**
     * 管理员界面展示用户设备
     *
     * @param userLoginDto
     * @return
     */
    @PostMapping(value = "/manager/device/list")
    public Result getDeviceListByUserName(@RequestBody UserDto userLoginDto) {
        return new Result(deviceService.getDeviceListByUserID(userLoginDto.getUserID()));
    }
}
