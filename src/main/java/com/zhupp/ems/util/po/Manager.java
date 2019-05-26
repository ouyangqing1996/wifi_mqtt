package com.zhupp.ems.util.po;

import java.util.Date;

public class Manager {
    private Long emsManagerInfoId;

    private String emsManagerId;

    private Date emsManagerCreateTime;

    private String emsManagerPassword;

    public Long getEmsManagerInfoId() {
        return emsManagerInfoId;
    }

    public void setEmsManagerInfoId(Long emsManagerInfoId) {
        this.emsManagerInfoId = emsManagerInfoId;
    }

    public String getEmsManagerId() {
        return emsManagerId;
    }

    public void setEmsManagerId(String emsManagerId) {
        this.emsManagerId = emsManagerId == null ? null : emsManagerId.trim();
    }

    public Date getEmsManagerCreateTime() {
        return emsManagerCreateTime;
    }

    public void setEmsManagerCreateTime(Date emsManagerCreateTime) {
        this.emsManagerCreateTime = emsManagerCreateTime;
    }

    public String getEmsManagerPassword() {
        return emsManagerPassword;
    }

    public void setEmsManagerPassword(String emsManagerPassword) {
        this.emsManagerPassword = emsManagerPassword == null ? null : emsManagerPassword.trim();
    }
}