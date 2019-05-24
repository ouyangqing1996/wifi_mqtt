package com.zhupp.ems.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class DeviceDto implements Serializable {
    /**
     * 数据库自增id
     */
    private long deviceId;
    /**
     * 用户命名的设备名称
     */
    private String deviceName;
    /**
     * 用户设置的设备所在地址
     */
    private String deviceAddress;
    /**
     * 设备所有者
     */
    private String deviceUserID;
    /**
     * 设备状态
     */
    private String deviceStatus;
    /**
     * 创建时间
     */
    private Date deviceCreateDate;
    /**
     * 更新时间
     */
    private Date deviceUpdateDate;


}
