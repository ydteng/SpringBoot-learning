package com.test.controller;

import com.test.domain.UserInfo;
import com.test.dto.GetAll.UserPageQueryDto;
import com.test.exception.ExceptionEnum;
import com.test.exception.MyExceptionHandler;
import com.test.exception.R;
import com.test.service.UserService;
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
        Integer id = userPageQueryDto.getId();
        return new R(id.toString());

    }
    @GetMapping("getall")
    public List<UserInfo> getAll(){
        return userService.getAll();
    }
}
