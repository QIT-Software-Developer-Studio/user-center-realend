/*
 * Copyright (c) 2023.
 * Project: user-center-realend
 * File: creat_table.sql
 * Last date: 2023/11/18 下午5:36
 * Developer: KingYen
 *
 * Created by KingYen on 2023/11/18 17:36:46.
 */

# DataBase Init
-- Create DataBase for user_center
create database if not exists user_center;

-- Turn to user_center DataBase
use user_center;

# Create table for user
create table user
(
    username     varchar(256)                       null comment '用户昵称',
    id           bigint auto_increment comment 'id'
        primary key,
    userAccount  varchar(256)                       null comment '账号',
    avatarUrl    varchar(1024)                      null comment '用户头像',
    gender       tinyint                            null comment '性别',
    userPassword varchar(512)                       not null comment '密码',
    phone        varchar(128)                       null comment '电话',
    email        varchar(512)                       null comment '邮箱',
    userStatus   int      default 0                 not null comment '状态 0 - 正常',
    createTime   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime   datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    isDelete     tinyint  default 0                 not null comment '是否删除',
    userRole     int      default 0                 not null comment '用户角色 0 - 普通用户 1 - 管理员'
)
    comment '用户';

# Import Administrator Sample Users
INSERT INTO user_center.user (username, userAccount, avatarUrl, gender, userPassword, phone, email, userStatus,
                              createTime, updateTime, isDelete, userRole)
VALUES ('admin', 'admin', 'https://himg.bdimg.com/sys/portraitn/item/public.1.e137c1ac.yS1WqOXfSWEasOYJ2-0pvQ', null,
        'b0dd3697a192885d7c055db46155b26a', null, null, 0, '2023-11-15 14:14:22', '2023-08-06 14:39:37', 0, 1);