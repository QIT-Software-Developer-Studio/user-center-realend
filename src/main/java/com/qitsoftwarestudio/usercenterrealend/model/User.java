package com.qitsoftwarestudio.usercenterrealend.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@TableName(value = "user")
@Data
public class User {
    // ID
    @TableId(type = IdType.AUTO)
    private Long id;

    // User Name
    private String username;

    // User Account
    private String userAccount;

    // User Password
    private String userPassword;

    // User gender
    private Integer gender;

    // User avatar
    private String avatarUrl;

    // User phone number
    private String phone;

    // User email
    private String email;

    // User status 0 - normalcy
    private Integer userStatus;

    // User create Date
    private Date createTime;

    // User update Date
    private Date updateTime;

    // Is User deleted
    @TableLogic
    private Integer isDelete;

    // User roles
    private Integer userRole;

    // Identifies the version of the class to ensure class compatibility and correct serialization.
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
