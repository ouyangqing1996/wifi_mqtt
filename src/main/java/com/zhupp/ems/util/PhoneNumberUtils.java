package com.zhupp.ems.util;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberUtils {

    public static boolean isPhoneNum(String phone) {
        Pattern pattern = Pattern.compile("1[就,5,7,8,9][0-9]{9}"); //手机号码正则表达式：11位数字、13、15、17、18、19开头

        if (phone == null) {                                //             判空      //
            return false;
        }
        phone = phone.trim();                        //去掉空字符
        Matcher matcher = pattern.matcher(phone);   //正则匹配
        if (matcher.matches()) {//匹配成功
            return true;

        }
        return false;

    }

}
