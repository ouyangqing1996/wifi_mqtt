package com.zhupp.ems.util.po;

import java.util.Date;

public class Data {
    private Long emsDataInfoId;

    private String emsDataMessage;

    private String emsDataMessageType;

    private Date emsDataCreateTime;

    private String emsDataDeviceId;

    public Long getEmsDataInfoId() {
        return emsDataInfoId;
    }

    public void setEmsDataInfoId(Long emsDataInfoId) {
        this.emsDataInfoId = emsDataInfoId;
    }

    public String getEmsDataMessage() {
        return emsDataMessage;
    }

    public void setEmsDataMessage(String emsDataMessage) {
        this.emsDataMessage = emsDataMessage == null ? null : emsDataMessage.trim();
    }

    public String getEmsDataMessageType() {
        return emsDataMessageType;
    }

    public void setEmsDataMessageType(String emsDataMessageType) {
        this.emsDataMessageType = emsDataMessageType == null ? null : emsDataMessageType.trim();
    }

    public Date getEmsDataCreateTime() {
        return emsDataCreateTime;
    }

    public void setEmsDataCreateTime(Date emsDataCreateTime) {
        this.emsDataCreateTime = emsDataCreateTime;
    }

    public String getEmsDataDeviceId() {
        return emsDataDeviceId;
    }

    public void setEmsDataDeviceId(String emsDataDeviceId) {
        this.emsDataDeviceId = emsDataDeviceId == null ? null : emsDataDeviceId.trim();
    }
}