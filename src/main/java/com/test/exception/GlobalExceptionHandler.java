package com.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {
    //处理普通系统异常
    @ExceptionHandler(value = Exception.class)
    public R systemException(Exception e){
        e.printStackTrace();
        System.out.println("==================================>>"+e.getMessage()+"=================================");
        System.out.println("www");
        return new R(false,null,"系统内部异常，请联系管理员");
    }

    @ExceptionHandler(value = MyExceptionHandler.class)
    public ResponseEntity<R> myException(MyExceptionHandler e){
        e.printStackTrace();
        ResponseEntity<R> responseEntity;
        switch (e.getCode()){
            case 403:
                responseEntity =  ResponseEntity.status(HttpStatus.FORBIDDEN).body(new R(e.getMsg()));
                break;
            case 404:
                responseEntity =  ResponseEntity.status(HttpStatus.NOT_FOUND).body(new R(e.getMsg()));
                break;
            default:
                responseEntity =  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new R(e.getMsg()));
                break;
        }

        return responseEntity;

    }
}
