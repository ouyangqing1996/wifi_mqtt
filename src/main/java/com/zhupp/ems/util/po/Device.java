package com.zhupp.ems.util.po;

import java.util.Date;

public class Device {
    private Long emsDeviceInfoId;

    private String emsDeviceUserId;

    private String emsDeviceStatus;

    private Date emsDeviceCreateTime;

    private Date emsDeviceUpdateTime;

    private String emsDeviceAddress;

    public Long getEmsDeviceInfoId() {
        return emsDeviceInfoId;
    }

    public void setEmsDeviceInfoId(Long emsDeviceInfoId) {
        this.emsDeviceInfoId = emsDeviceInfoId;
    }

    public String getEmsDeviceUserId() {
        return emsDeviceUserId;
    }

    public void setEmsDeviceUserId(String emsDeviceUserId) {
        this.emsDeviceUserId = emsDeviceUserId == null ? null : emsDeviceUserId.trim();
    }

    public String getEmsDeviceStatus() {
        return emsDeviceStatus;
    }

    public void setEmsDeviceStatus(String emsDeviceStatus) {
        this.emsDeviceStatus = emsDeviceStatus == null ? null : emsDeviceStatus.trim();
    }

    public Date getEmsDeviceCreateTime() {
        return emsDeviceCreateTime;
    }

    public void setEmsDeviceCreateTime(Date emsDeviceCreateTime) {
        this.emsDeviceCreateTime = emsDeviceCreateTime;
    }

    public Date getEmsDeviceUpdateTime() {
        return emsDeviceUpdateTime;
    }

    public void setEmsDeviceUpdateTime(Date emsDeviceUpdateTime) {
        this.emsDeviceUpdateTime = emsDeviceUpdateTime;
    }

    public String getEmsDeviceAddress() {
        return emsDeviceAddress;
    }

    public void setEmsDeviceAddress(String emsDeviceAddress) {
        this.emsDeviceAddress = emsDeviceAddress == null ? null : emsDeviceAddress.trim();
    }
}