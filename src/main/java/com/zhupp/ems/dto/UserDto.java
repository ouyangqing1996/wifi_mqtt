package com.zhupp.ems.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Data
public class UserDto implements Serializable {
    /**
     * 数据库自增的用户id
     */
    private long userInfoId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 账号
     */
    @NotBlank(message = "账号不能为空!")
    private String userID;
    /**
     * 用户密码
     */
    @NotBlank(message = "密码不能为空!")
    private String userPassword;
    /**
     * 用户状态
     */
    private String userStatus;
    /**
     * 创建时间
     */
    private Date userCreateDate;
    /**
     * 更新时间
     */
    private Date userUpdateDate;

}
