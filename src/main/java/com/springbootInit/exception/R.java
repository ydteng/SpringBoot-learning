package com.springbootInit.exception;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class R {
    private Boolean status;
    private Object data;
    private String msg;
    private final String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

    /**
     * 完全自定义的返回，所有数据都要填写
     *
     * @param status 状态
     * @param data   数据
     * @param msg    消息
     */
    public R(Boolean status, Object data, String msg) {
        this.status = status;
        this.data = data;
        this.msg = msg;
    }


    /**
     * 成功时候的返回
     *
     * @param data 数据
     * @param msg  消息
     */
    public R(Object data, String msg) {
        this.status = true;
        this.data = data;
        this.msg = msg;
    }

    /**
     * status为false时，用于自定义异常返回
     *
     * @param msg 消息
     */
    public R(String msg) {
        this.status = false;
        this.data = null;
        this.msg = msg;
    }

    /**
     * 普通的已存在枚举类中的异常
     *
     * @param exceptionEnum 异常枚举
     */
    public R(ExceptionEnum exceptionEnum) {
        throw new MyExceptionHandler(exceptionEnum);
    }
}
