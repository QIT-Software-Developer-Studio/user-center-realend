/*
 * Copyright (c) 2023.
 * Project: user-center-realend
 * File: UserService.java
 * Last date: 2023/11/18 下午5:36
 * Developer: KingYen
 *
 * Created by KingYen on 2023/11/18 17:36:46.
 */

package com.qitsoftwarestudio.usercenterrealend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qitsoftwarestudio.usercenterrealend.model.User;
import jakarta.servlet.http.HttpServletRequest;

/**
 * UserService
 * 用户服务
 *
 * @author KingYen.
 * @from QIT Software Studio
 */
public interface UserService extends IService<User> {

    /**
     * userRegister
     * 用户注册
     *
     * @param userAccount   用户账号
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return id           用户ID
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * userLogin
     * 用户登录
     *
     * @param userAccount  用户账号
     * @param userPassword 用户密码
     * @param request
     * @return userProfile
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * userLogout
     * 用户注销
     *
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);

    /**
     * userProfile
     * 用户信息
     *
     * @param originUser
     * @return
     */
    User userProfile(User originUser);

}
