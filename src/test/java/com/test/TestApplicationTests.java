package com.test;

import com.test.dao.UserDao;
import com.test.domain.UserInfo;
import com.test.mapper.UserMapper;
import com.test.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootTest
class TestApplicationTests {
    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserMapper userMapper;
    @Test
    void mapperTest(){
        System.out.println(userDao.selectAll());

    }

    @Test
    void exceptionTest(){
        int x = 5/0;
        System.out.println(x);
    }
    @Test
    void tempTest(){
        System.out.println(userMapper.selectAll());
    }

}
