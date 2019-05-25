package com.zhupp.ems.controller;

import com.zhupp.ems.service.UserService;
import com.zhupp.ems.util.OptResult;
import com.zhupp.ems.util.PhoneNumberUtils;
import com.zhupp.ems.util.StringUtils;
import com.zhupp.ems.util.ValiCodeUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author OuYang Qing 2019/05/22
 * @apiNote 用户注册接口， 统一使用手机号注册，需要校对验证码，以4个8开头的手机号被认为是测试账号，直接返回验证码给前端，而不需要真正发一条验证码短信
 */
@Api("user_regitset")
@RestController
@RequestMapping("/user/")
public class RegisterController {

    @Autowired
    UserService userDao;

    private OptResult opt = new OptResult();  //准备好返回实体，为节省内存，建议放到成员变量,而不是每次new 一个
    /**
     * @param phone       要注册的手机号
     * @param valicode    收到的短信验证码
     * @return            Json串， result为1表示成功，0代表失败
     *
     * 前端首先调用发送验证码的接口sendValiCode， 再将验证码和手机号作为参数调用注册接口regitser
     */
    @ApiOperation("ouyangqing")
    @PostMapping("register")
    public OptResult register(@RequestParam()String phone,
                              @RequestParam()String valicode,
                              @RequestParam() String userName,
                              @RequestParam()String passwd,
                              HttpServletRequest request){
        if(!phone.startsWith("888")){            //if it is not a test account, then validate it
            if(!PhoneNumberUtils.isPhoneNum(phone)){        //校对手机号格t式
                return opt.setMsg("请输入正确的手机号码").setResult("0");
            }
            if(StringUtils.isEmptyOrNull(valicode)){       //验证码判空
                return opt.setMsg("清输入正确的验证码").setResult("0");
            }
            if(userDao.isExist(phone)){                  //是否已经注册？
                return opt.setResult("0").setMsg("手机号已经注册了");
            }
        }

        Object yzm = request.getSession().getAttribute("yzm_" + phone);
        if(yzm!=null){
            String yzm2=(String)yzm;
            if(yzm.equals(valicode)){
                int i = userDao.register(phone,passwd, userName);
                if(i!=0){
                    return opt.setResult("1").setMsg("注册成功");
                }else {
                    System.out.println("userDao.dto 调用异常======================");
                    return opt.setResult("0").setMsg("注册失败");
                }
            }
        }else {
            opt.setResult("0").setMsg("验证码不正确，清重新发送验证码");
        }
        return opt;
    }

    @PostMapping("sendvalicode")
    public OptResult sendValiCode(String phone,
                                  HttpServletRequest request){
        ValiCodeUtils valiCodeUtils = new ValiCodeUtils(request.getSession());
        return valiCodeUtils.sendValiCode(phone);
    }
}
