package com.springbootInit.controller;

import com.springbootInit.domain.UserInfo;
import com.springbootInit.dto.GetAll.UserPageQueryDto;
import com.springbootInit.exception.ExceptionEnum;
import com.springbootInit.exception.MyExceptionHandler;
import com.springbootInit.exception.R;
import com.springbootInit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    public R getUserById(@Validated @ModelAttribute UserPageQueryDto userPageQueryDto){
        if (true){
            throw new MyExceptionHandler(ExceptionEnum.INTERNAL_SERVER_ERROR);
        }
        return null;

    }
    @GetMapping("getall")
    public List<UserInfo> getAll(){
        return userService.getAll();
    }
}
