package com.test.service;

import com.test.domain.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserInfo> getAll();
    UserInfo getUserById(Integer id);

}
