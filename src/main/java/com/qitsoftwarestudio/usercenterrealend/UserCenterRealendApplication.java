package com.qitsoftwarestudio.usercenterrealend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qitsoftwarestudio.usercenterrealend.mapper")
public class UserCenterRealendApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterRealendApplication.class, args);
    }

}
