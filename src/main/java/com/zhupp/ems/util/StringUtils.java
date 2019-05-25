package com.zhupp.ems.util;

public class StringUtils {

    public static boolean isEmptyOrNull(String s){
        if(s==null){
            return true;
        }
        s=s.trim();
        if(s.equals("")){
            return true;
        }
        return false;
    }
}
