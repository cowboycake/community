package com.nowcoder.dao;


import com.nowcoder.community.CommunityApplication;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class TestUserDao {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void testApplicationContext() {
         User user= userMapper.selectById(11);
        System.out.println(user);
    }
}
