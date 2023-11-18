/*
 * Copyright (c) 2023.
 * Project: user-center-realend
 * File: BusinessException.java
 * Last date: 2023/11/18 下午5:36
 * Developer: KingYen
 *
 * Created by KingYen on 2023/11/18 17:36:46.
 */

package com.qitsoftwarestudio.usercenterrealend.exception;

import com.qitsoftwarestudio.usercenterrealend.common.ErrorCode;

/**
 * 异常处理
 *
 * @author KingYen.
 * @from QIT Software Studio
 */
public class BusinessException extends RuntimeException {

    /**
     * code
     * 相应状态码
     */
    private final int code;

    /**
     * description
     * 描述
     */
    private final String description;

    public BusinessException(int code, String message, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public BusinessException(ErrorCode errorCode, String exception) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = exception;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
