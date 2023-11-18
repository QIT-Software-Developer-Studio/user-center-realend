/*
 * Copyright (c) 2023.
 * Project: user-center-realend
 * File: UserServiceImpl.java
 * Last date: 2023/11/18 下午5:36
 * Developer: KingYen
 *
 * Created by KingYen on 2023/11/18 17:36:46.
 */

package com.qitsoftwarestudio.usercenterrealend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qitsoftwarestudio.usercenterrealend.common.ErrorCode;
import com.qitsoftwarestudio.usercenterrealend.exception.BusinessException;
import com.qitsoftwarestudio.usercenterrealend.mapper.UserMapper;
import com.qitsoftwarestudio.usercenterrealend.model.User;
import com.qitsoftwarestudio.usercenterrealend.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UserServiceImpl
 * 用户服务实现
 *
 * @author KingYen.
 * @from QIT Software Studio
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * userRegister
     * 用户注册
     *
     * @param userAccount   用户账号
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return
     */
    @Override
    public long userRegister(String userAccount, String userPassword, String checkPassword) {
        // Is empty string
        if (!StringUtils.hasText(userAccount) || !StringUtils.hasText(userPassword) || !StringUtils.hasText(checkPassword)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "parameter is empty");
        }
        // To check account formet
        if (userAccount.length() < 4) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "user account must be at least 4 characters");
        }
        // To check password formet
        if (userPassword.length() < 8) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "password must be at least 8 characters");
        }
        // To check special character
        String validPattern = "[`~!@#$%^&*()+=|{}':;',\\\\[\\\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Matcher matcher = Pattern.compile(validPattern).matcher(userAccount);
        if (matcher.find()) {
            return -1;
        }
        // To check user password and check password is same
        if (!userPassword.equals(checkPassword)) {
            return -1;
        }
        // To check Whether the account is registered
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userAccount", userAccount);
        long count = userMapper.selectCount(queryWrapper);
        if (count > 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "account has been registered");
        }
        // password encrypted
        String encryptPassword = DigestUtils.md5DigestAsHex(userPassword.getBytes());
        // Get new user object
        User user = new User();
        user.setUserAccount(userAccount);
        user.setUserPassword(userPassword);
        boolean saveResult = this.save(user);
        if (!saveResult) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "User creation failed");
        }
        return user.getId();
    }

    @Override
    public User userLogin(String userAccount, String userPassword, HttpServletRequest request) {
        return null;
    }

    @Override
    public int userLogout(HttpServletRequest request) {
        return 0;
    }

    @Override
    public User userProfile(User originUser) {
        return null;
    }
}
