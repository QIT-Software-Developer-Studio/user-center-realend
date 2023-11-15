/*
 * Copyright (c) 2023.
 * Project: user-center-realend
 * File: ResultUtils.java
 * Last date: 2023/11/16 上午12:35
 * Developer: KingYen
 *
 * Created by KingYen on 2023/11/16 0:35:9.
 */

package com.qitsoftwarestudio.usercenterrealend.utils;

import com.qitsoftwarestudio.usercenterrealend.common.BaseResponse;
import com.qitsoftwarestudio.usercenterrealend.common.RequestCode;
import lombok.Data;

@Data
public class ResultUtils {
    /**
     * Success
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse(0, "ok", data);
    }

    /**
     * Fail
     *
     * @param requestCode
     * @return
     */
    public static BaseResponse error(RequestCode requestCode) {
        return new BaseResponse<>(requestCode);
    }

}