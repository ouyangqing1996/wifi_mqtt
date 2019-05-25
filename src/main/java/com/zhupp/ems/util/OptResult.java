package com.zhupp.ems.util;


public class OptResult {
    private String msg;
    private String result;

    public String getMsg() {
        return msg;
    }

    public OptResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getResult() {
        return result;
    }

    public OptResult setResult(String result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                "msg:'" + msg + '\'' +
                ", result:'" + result + '\'' +
                '}';
    }
}
