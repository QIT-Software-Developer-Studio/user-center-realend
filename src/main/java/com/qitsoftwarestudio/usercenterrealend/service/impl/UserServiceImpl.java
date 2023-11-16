package com.qitsoftwarestudio.usercenterrealend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qitsoftwarestudio.usercenterrealend.mapper.UserMapper;
import com.qitsoftwarestudio.usercenterrealend.model.User;
import com.qitsoftwarestudio.usercenterrealend.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
