package com.test.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Data
public class R {
    private Boolean status;
    private Object data;
    private String msg;

    public R() {
    }

    //完全自定义的返回
    public R(Boolean status, Object data, String msg) {
        this.status = status;
        this.data = data;
        this.msg = msg;
    }

    //status为true时，用于正常返回
    public R(Object data, String msg) {
        this.status = true;
        this.data = data;
        this.msg = msg;
    }
    //status为false时，用于异常返回
    public R(String msg) {
        this.status = false;
        this.data = null;
        this.msg = msg;
    }
    //普通的已存在枚举类中的异常
    public R(ExceptionEnum exceptionEnum) {
        throw new MyExceptionHandler(exceptionEnum);
    }
}
