package com.zhupp.ems.util;

public enum ResultEnum {

    SUCCESS("1", "success"),

    SYSTEM_ERROR("01", "系服务器忙，请稍后再试"),

    PARAMETER_EMPTY("02", "参数不能为空"),

    REQUEST_PARAM_ERROR("03", "请求参数格式错误"),

    NOT_USERID("04","账号不存在"),

    VAILID_ERROR("05", "用户验证失败"),

    PASSWORD_ERROR("05", "密码错误");

    public final String code;
    public final String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
