package com.qitsoftwarestudio.usercenterrealend;

import com.qitsoftwarestudio.usercenterrealend.mapper.UserMapper;
import com.qitsoftwarestudio.usercenterrealend.model.User;
import jakarta.annotation.Resource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SamleTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println("------ selectAll method test ------");
        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals(1, userList.size());
        userList.forEach(System.out::println);
    }

}
