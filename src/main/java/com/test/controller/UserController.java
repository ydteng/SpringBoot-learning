package com.test.controller;

import com.test.domain.UserInfo;
import com.test.exception.ExceptionEnum;
import com.test.exception.MyExceptionHandler;
import com.test.exception.R;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    public R getUserById(@PathVariable Integer id){

        if(id==1) return new R(null, "成功！");
        else if (id == 2) return new R(ExceptionEnum.SIGNATURE_NOT_MATCH);
        else if (id == 3) return new R(ExceptionEnum.NOT_FOUND);
        else if (id == 4) return new R(ExceptionEnum.INTERNAL_SERVER_ERROR);
        else{
            return new R(userService.getUserById(5),"数据库");
        }
    }
}
