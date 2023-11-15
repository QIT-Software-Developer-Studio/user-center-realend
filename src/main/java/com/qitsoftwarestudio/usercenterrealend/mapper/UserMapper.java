package com.qitsoftwarestudio.usercenterrealend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qitsoftwarestudio.usercenterrealend.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
