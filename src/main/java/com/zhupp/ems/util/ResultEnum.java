package com.zhupp.ems.util;

public enum ResultEnum {

    SUCCESS("000000", "success"),

    SYSTEM_ERROR("111111", "系统错误"),

    PARAMETER_EMPTY("000001", "参数不能为空"),

    REQUEST_PARAM_ERROR("000002", "请求参数格式错误"),

    NOT_USERID("000003","账号不存在"),

    VAILID_ERROR("000005", "用户验证失败"),

    PASSWORD_ERROR("000004", "密码错误");

    public final String code;
    public final String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
