package com.zhupp.ems.service;

import com.zhupp.ems.util.Result;
import com.zhupp.ems.util.ResultEnum;
import com.zhupp.ems.dto.UserDto;
import com.zhupp.ems.dao.ManagerMapper;
import com.zhupp.ems.dao.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.UUID;

@Service
@Slf4j
public class LoginService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private  ManagerMapper managerMapper;
    /**
     * 用户登录
     * @param req
     * @return
     */
    public Result userLogin(UserDto req, HttpServletRequest request) {
        String userPassword = userMapper.getPasswordByUserID(req.getUserID());
        return login(userPassword, req,request);
    }

    /**
     * 管理员登录
     */
    public Result managerLogin(UserDto req, HttpServletRequest request) {
        String userPassword = managerMapper.getPasswordByUserID(req.getUserID());
        return login(userPassword, req,request);
    }

    /**
     * 注销
     * @param request
     */
    public void logout(HttpServletRequest request){
        request.getSession().setAttribute("isVailid","");
        log.info("用户已经注销");
    }

    /**
     * 登录
     * @param userPassword
     * @param req
     * @return
     */
    private static Result login(String userPassword, UserDto req, HttpServletRequest request) {
        if (userPassword == null || userPassword == "") {
            return new Result(ResultEnum.NOT_USERID);
        } else {
            if (!req.getUserPassword().equals(userPassword)) {
                return new Result(ResultEnum.PASSWORD_ERROR);
            }
        }
        HttpSession session = request.getSession();
        session.setAttribute("userID", req.getUserID());
        session.setAttribute("isVailid", UUID.randomUUID());
        log.info("账号登录成功");
        return new Result(ResultEnum.SUCCESS);
    }
}
