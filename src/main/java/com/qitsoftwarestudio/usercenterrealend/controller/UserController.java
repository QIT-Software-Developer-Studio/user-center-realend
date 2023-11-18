/*
 * Copyright (c) 2023.
 * Project: user-center-realend
 * File: UserController.java
 * Last date: 2023/11/18 下午5:36
 * Developer: KingYen
 *
 * Created by KingYen on 2023/11/18 17:36:46.
 */

package com.qitsoftwarestudio.usercenterrealend.controller;

import com.qitsoftwarestudio.usercenterrealend.common.BaseResponse;
import com.qitsoftwarestudio.usercenterrealend.common.ErrorCode;
import com.qitsoftwarestudio.usercenterrealend.exception.BusinessException;
import com.qitsoftwarestudio.usercenterrealend.model.request.UserRegisterRequest;
import com.qitsoftwarestudio.usercenterrealend.service.UserService;
import com.qitsoftwarestudio.usercenterrealend.utils.ResultUtils;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/register")
    public BaseResponse<Long> userRegister(@RequestBody UserRegisterRequest userRegisterRequest) {
        if (userRegisterRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String userAccount = userRegisterRequest.getUserAccount();
        String userPassword = userRegisterRequest.getUserPassword();
        String checkPassword = userRegisterRequest.getCheckPassword();
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        return ResultUtils.success(result);
    }
}
