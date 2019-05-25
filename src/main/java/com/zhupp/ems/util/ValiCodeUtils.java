package com.zhupp.ems.util;

import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * @author Ouyang Qing 2019/05/22
 * 发送验证码工具  一分钟内发一次，一天最多10次
 */
public class ValiCodeUtils {
    private   OptResult opt = new OptResult();
    private Random rd = new Random();
    private HttpSession session;

    public ValiCodeUtils(HttpSession session){
        this.session = session;
    }

    public OptResult sendValiCode(String phone){      //生成随机验证码并发送给手机，并且把生成的验证码放到Redis缓存中Key：yzm_手机号  Value: 验证码
        try {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                builder.append(rd.nextInt(10));
            }
            String valicode = builder.toString();
            session.setAttribute("yzm_"+phone,valicode);

            if(phone.startsWith("888")){             //测试账号，直接返回验证码
                opt.setMsg(valicode).setResult("1");

            }else {                              //正常手机号，发送短信
                if(!PhoneNumberUtils.isPhoneNum(phone)){
                    return opt.setMsg("请输入正确的手机号码").setResult("0");
                }
                Object last_sent = session.getAttribute("last_sent_"+phone);
                if(last_sent==null){
                    last_sent = System.currentTimeMillis();
                    System.out.println("last_sent 为null");
                    session.setAttribute("last_sent_"+phone,System.currentTimeMillis());
                    System.out.println(valicode);
                    return opt.setMsg("请求成功，验证码已发送").setResult("1");
                }
                long last_sent2 = (long)last_sent;
                if((System.currentTimeMillis()-last_sent2)<=60000){                      //距上次发送不足一分钟，不让发送验证码
                    return opt.setResult("0").setMsg("请求的太快了，稍后再试吧！");

                }else {
                    //TODO 调用短信发送服务 发送验证码到手机
                    System.out.println(valicode);
                    session.setAttribute("last_sent_"+phone,System.currentTimeMillis());
                    return opt.setMsg("请求成功，验证码已发送").setResult("1");

                }
            }
        }catch (Exception e){
            e.printStackTrace();
            opt.setResult("0").setMsg("服务器繁忙，请稍候再试");
            System.out.println("RegisterController sendValicode方法异常");
        }
        return opt;
    }

}
