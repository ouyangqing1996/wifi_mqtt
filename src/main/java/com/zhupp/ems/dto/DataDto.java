package com.zhupp.ems.dto;

import lombok.Data;

import java.util.Date;

@Data
public class DataDto {
    /**
     * 数据库自增id
     */
    private long dataId;
    /**
     * 数据
     */
    private String data;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 所属设备id
     */
    private String deviceId;

    /**
     * 数据类型
     */
    private String dateType;
}
