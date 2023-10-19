package com.springbootInit.service.impl;

import com.springbootInit.dao.UserDao;
import com.springbootInit.domain.UserInfo;
import com.springbootInit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserInfo> getAll() {
        return userDao.selectAll();
    }

    @Override
    public UserInfo getUserById(Integer id) {

        System.out.println(id);
        System.out.println(userDao.selectById(id));
        return userDao.selectById(id);
    }
}
