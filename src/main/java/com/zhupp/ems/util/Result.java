package com.zhupp.ems.util;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Data
@Slf4j
@JSONType(includes = {"retCode", "retMsg", "data", "timeStamp"})
public class Result<T> implements Serializable {
    private String retCode;
    private String retMsg;
    private String timeStamp;
    private T data;

    public Result(String retCode, String retMsg, T data) {
        this.data = data;
        this.retCode = retCode;
        this.retMsg = retMsg;
        this.timeStamp = Long.toString(System.currentTimeMillis());
    }

    public Result(ResultEnum resultEnum) {
        this(resultEnum.code, resultEnum.msg, null);
    }

    public Result(ResultEnum resultEnum, T data) {
        this(resultEnum.code, resultEnum.msg, data);
    }

    public Result(T data) {
        this(ResultEnum.SUCCESS, data);
    }

    public Result(String retCode, String retMsg) {
        this(retCode, retMsg, null);
    }

    public Result() {
        this(ResultEnum.SUCCESS);
    }


    public boolean isSuccess() {
        return ResultEnum.SUCCESS.code.equals(retCode);
    }

    public boolean isNotSuccess() {
        return !isSuccess();
    }

    public static  Result error() {
        return new Result(ResultEnum.SYSTEM_ERROR.code, ResultEnum.SYSTEM_ERROR.msg);
    }

    public static Result nullParam(){
        return new Result(ResultEnum.PARAMETER_EMPTY.code, ResultEnum.PARAMETER_EMPTY.msg);
    }

    public static Result paramError() {
        return new Result(ResultEnum.REQUEST_PARAM_ERROR.code, ResultEnum.REQUEST_PARAM_ERROR.msg);

    }
}
