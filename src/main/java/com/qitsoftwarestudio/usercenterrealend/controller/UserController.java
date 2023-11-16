package com.qitsoftwarestudio.usercenterrealend.controller;

import com.qitsoftwarestudio.usercenterrealend.common.Result;
import com.qitsoftwarestudio.usercenterrealend.model.User;
import com.qitsoftwarestudio.usercenterrealend.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/save")
    public Result save(@RequestBody User user) {
        return userService.save(user) ? Result.ture() : Result.fail();
    }

}
