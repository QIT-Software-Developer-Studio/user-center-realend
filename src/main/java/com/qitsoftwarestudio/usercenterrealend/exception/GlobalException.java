/*
 * Copyright (c) 2023.
 * Project: user-center-realend
 * File: GlobalException.java
 * Last date: 2023/11/18 下午5:36
 * Developer: KingYen
 *
 * Created by KingYen on 2023/11/18 17:36:46.
 */

package com.qitsoftwarestudio.usercenterrealend.exception;

import com.qitsoftwarestudio.usercenterrealend.common.BaseResponse;
import com.qitsoftwarestudio.usercenterrealend.common.ErrorCode;
import com.qitsoftwarestudio.usercenterrealend.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 *
 * @author KingYen.
 * @from QIT Software Studio
 */
@RestControllerAdvice
@Slf4j
public class GlobalException {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessExceptionHandler(BusinessException e) {
        log.error("businessException: " + e.getMessage(), e);
        return ResultUtils.error(e.getCode(), e.getMessage(), e.getDescription());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> runtimeExceptionHandler(RuntimeException e) {
        log.error("runtimeException", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, e.getMessage(), "");
    }
}