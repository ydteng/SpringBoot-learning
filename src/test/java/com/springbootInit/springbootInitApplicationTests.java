package com.springbootInit;

import com.springbootInit.dao.UserDao;
import com.springbootInit.domain.UserInfo;
import com.springbootInit.dto.GetAll.UserPageResultDto;
import com.springbootInit.exception.MyExceptionHandler;
import com.springbootInit.mapper.UserMapper;
import com.springbootInit.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class springbootInitApplicationTests {
    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;
    @Test
    void mapperTest(){
        UserInfo userInfo = userDao.selectById(2);

        UserPageResultDto userPageResultDto = UserMapper.INSTANCE.toDto(userInfo);
        System.out.println("--------------------");
        System.out.println(userPageResultDto);
//        BeanUtils.copyProperties(userDao.selectById(2),userPageResultDto);
//        System.out.println("--------------------");
//        System.out.println(userPageResultDto);
    }

    @Test
    void exceptionTest(){
        int x = 5/0;
        System.out.println(x);
    }
    @Test
    void tempTest(){
        throw new MyExceptionHandler(true,"测试");
    }

}
