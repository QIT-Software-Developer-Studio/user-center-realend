/*
 * Copyright (c) 2023.
 * Project: user-center-realend
 * File: UserLoginRequest.java
 * Last date: 2023/11/16 上午12:35
 * Developer: KingYen
 *
 * Created by KingYen on 2023/11/16 0:35:9.
 */

package com.qitsoftwarestudio.usercenterrealend.model.request;

import java.io.Serial;
import java.io.Serializable;

public class UserLoginRequest implements Serializable {

    // Identifies the version of the class to ensure class compatibility and correct serialization.
    @Serial
    private static final long serialVersionUID = 1L;

    // User account to login
    private String userAccount;

    // User password to login
    private String userPassword;

}
