package com.zhupp.ems.service;

import com.github.pagehelper.util.StringUtil;
import com.zhupp.ems.dao.ManagerMapper;
import com.zhupp.ems.dao.UserMapper;
import com.zhupp.ems.util.Result;
import com.zhupp.ems.util.ResultEnum;
import com.zhupp.ems.util.po.ManagerExample;
import com.zhupp.ems.util.po.User;
import com.zhupp.ems.util.po.UserExample;
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
    private ManagerMapper managerMapper;
    /**
     * 用户登录
     * @param
     * @return
     */
    public Result userLogin(User user, HttpServletRequest request) {
        UserExample example = new UserExample();
        example.createCriteria().andEmsUserIdEqualTo(user.getEmsUserId());
        //根据账户只会有一个密码
        String userPassword = userMapper.selectByExample(example).get(0).getEmsUserPassword();
        return login(userPassword, user,request);
    }

    /**
     * 管理员登录
     * 前端注意，管理员的账号密码也用了User封装。
     */
    public Result managerLogin(User user, HttpServletRequest request) {
        ManagerExample example = new ManagerExample();
        example.createCriteria().andEmsManagerIdEqualTo(user.getEmsUserId());
        //根据账户只会有一个密码
        String userPassword = managerMapper.selectByExample(example).get(0).getEmsManagerPassword();
        return login(userPassword, user,request);
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
     * @param
     * @return
     */
    private static Result login(String userPassword, User user, HttpServletRequest request) {
        if (StringUtil.isEmpty(userPassword)) {
            return new Result(ResultEnum.NOT_USERID);
        } else {
            if (!user.getEmsUserPassword().equals(userPassword)) {
                return new Result(ResultEnum.PASSWORD_ERROR);
            }
        }
        HttpSession session = request.getSession();
        session.setAttribute("userID", user.getEmsUserId());
        session.setAttribute("isVailid", UUID.randomUUID());
        log.info("账号登录成功");
        return new Result(ResultEnum.SUCCESS);
    }
}
