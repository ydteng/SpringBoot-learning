package com.springbootInit.service;

import com.springbootInit.domain.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserInfo> getAll();
    UserInfo getUserById(Integer id);

}
