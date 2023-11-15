/*
 * Copyright (c) 2023.
 * Project: user-center-realend
 * File: RequestCode.java
 * Last date: 2023/11/16 上午12:49
 * Developer: KingYen
 *
 * Created by KingYen on 2023/11/16 0:49:54.
 */

package com.qitsoftwarestudio.usercenterrealend.common;

import lombok.Getter;

/**
 * RequestCode
 * <p>
 * 0 - success
 * other - failure
 */
@Getter
public enum RequestCode {
    SUCCESS(0, "ok"),
    PARAMS_ERROR(40000, "请求参数错误"),
    NULL_ERROR(40001, "请求数据为空"),
    NOT_LOGIN(40100, "未登录"),
    NO_AUTH(40101, "无权限"),
    SYSTEM_ERROR(50000, "系统内部异常");

    // 相应状态码 0 - success, other - failure
    private final int code;

    // 相应状态信息 ok - success, other - failure
    private final String message;

    RequestCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
