package com.zhupp.ems.util.mqtt;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class Test1 {
    static int a=9;
    static {
        a=8;
    }
    public static void a(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        a();
    }
}