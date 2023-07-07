package com.test.service.impl;

import com.test.dao.UserDao;
import com.test.domain.UserInfo;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserInfo> getAll() {
        return null;
    }

    @Override
    public UserInfo getUserById(Integer id) {

        System.out.println(id);
        System.out.println(userDao.selectById(id));
        return userDao.selectById(id);
    }
}
