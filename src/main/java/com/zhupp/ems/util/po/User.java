package com.zhupp.ems.util.po;

import java.util.Date;

public class User {
    private Long emsUserInfoId;

    private String emsUserId;

    private String emsUserPassword;

    private String emsUserStatus;

    private Date emsUserCreateTime;

    private Date emsUserUpdateTime;

    private String emsUserName;

    public Long getEmsUserInfoId() {
        return emsUserInfoId;
    }

    public void setEmsUserInfoId(Long emsUserInfoId) {
        this.emsUserInfoId = emsUserInfoId;
    }

    public String getEmsUserId() {
        return emsUserId;
    }

    public void setEmsUserId(String emsUserId) {
        this.emsUserId = emsUserId == null ? null : emsUserId.trim();
    }

    public String getEmsUserPassword() {
        return emsUserPassword;
    }

    public void setEmsUserPassword(String emsUserPassword) {
        this.emsUserPassword = emsUserPassword == null ? null : emsUserPassword.trim();
    }

    public String getEmsUserStatus() {
        return emsUserStatus;
    }

    public void setEmsUserStatus(String emsUserStatus) {
        this.emsUserStatus = emsUserStatus == null ? null : emsUserStatus.trim();
    }

    public Date getEmsUserCreateTime() {
        return emsUserCreateTime;
    }

    public void setEmsUserCreateTime(Date emsUserCreateTime) {
        this.emsUserCreateTime = emsUserCreateTime;
    }

    public Date getEmsUserUpdateTime() {
        return emsUserUpdateTime;
    }

    public void setEmsUserUpdateTime(Date emsUserUpdateTime) {
        this.emsUserUpdateTime = emsUserUpdateTime;
    }

    public String getEmsUserName() {
        return emsUserName;
    }

    public void setEmsUserName(String emsUserName) {
        this.emsUserName = emsUserName == null ? null : emsUserName.trim();
    }
}