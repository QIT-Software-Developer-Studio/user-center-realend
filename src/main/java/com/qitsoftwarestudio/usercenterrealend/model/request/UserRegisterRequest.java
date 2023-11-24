/*
 * Copyright (c) 2023.
 * Project: user-center-realend
 * File: UserRegisterRequest.java
 * Last date: 2023/11/16 上午12:35
 * Developer: KingYen
 *
 * Created by KingYen on 2023/11/16 0:35:9.
 */

package com.qitsoftwarestudio.usercenterrealend.model.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class UserRegisterRequest implements Serializable {

    // Identifies the version of the class to ensure class compatibility and correct serialization.
    @Serial
    private static final long serialVersionUID = 1L;

    // User account to register
    private String userAccount;

    // User password to register
    private String userPassword;

    // User check password to register
    private String checkPassword;

}
