package com.nowcoder.dao;


import com.nowcoder.community.CommunityApplication;
import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class TestPost {

    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Test
    public void testApplicationContext() {
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(101,3,6);
        System.out.println(list.size());
        System.out.println(list);
    }
}
