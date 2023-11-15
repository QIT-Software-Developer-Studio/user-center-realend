/*
 * Copyright (c) 2023.
 * Project: user-center-realend
 * File: BaseResponse.java
 * Last date: 2023/11/16 上午12:49
 * Developer: KingYen
 *
 * Created by KingYen on 2023/11/16 0:49:54.
 */

package com.qitsoftwarestudio.usercenterrealend.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse<T> implements Serializable {

    // 相应状态码 0 - success, other - failureure
    private int code;

    // 相应状态 ok - success, other - failure
    private String message;

    // 返回数据
    private T data;

    public BaseResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public BaseResponse(RequestCode requestCode) {
        this(requestCode.getCode(), requestCode.getMessage(), null);
    }

}
