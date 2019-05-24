package com.zhupp.ems.controller;

import com.alibaba.fastjson.JSON;
import com.zhupp.ems.service.LoginService;
import com.zhupp.ems.util.Result;
import com.zhupp.ems.util.ResultEnum;
import com.zhupp.ems.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/ems/login")
@Slf4j
/**
 * 登录模块
 */
public class UserLoginController {
    @Autowired
    private LoginService loginService;

    /**
     * 用户登录
     * @param userDto
     * @param request
     * @return
     */
    @PostMapping(value = "/userLogin")
    public Result userLogin(@RequestBody @Validated UserDto userDto, HttpServletRequest request) {
        log.info("用户正在登录"+ JSON.toJSONString(userDto));
        return loginService.userLogin(userDto, request);
    }

    /**
     * 管理员登录
     * @param userDto
     * @param request
     * @return
     */
    @PostMapping(value = "/managerLogin")
    public Result managerLogin(@RequestBody @Validated UserDto userDto, HttpServletRequest request) {
        log.info("管理员正在登录"+ JSON.toJSONString(userDto));
        return loginService.managerLogin(userDto, request);
    }

    /**
     * 注销账号
     * @param request
     * @return
     */
    @GetMapping(value = "/logout")
    public Result logout(HttpServletRequest request) {
        log.info("正在注销");
        loginService.logout(request);
        return new Result(ResultEnum.SUCCESS);
    }
}
