package com.test.exception;

import org.springframework.http.HttpStatus;

public class MyExceptionHandler extends RuntimeException{
    private Integer code ;
    private Boolean status;
    private String msg ;
    //此构造函数用于枚举中已有的异常
    public MyExceptionHandler(ExceptionEnum exceptionEnum){
        super();
        this.code = exceptionEnum.getResultCode();
        this.status = exceptionEnum.getResultStatus();
        this.msg = exceptionEnum.getResultMsg();
    }
    //完全自定义
    public MyExceptionHandler(Integer code, Boolean status, String msg){
        super(msg);
        this.code = code;
        this.status = status;
        this.msg = msg;
    }
    //用于其他服务器拒绝的情况，比如具体参数错误，格式错误等,这个可能用的比较多，所以单独一个
    public MyExceptionHandler(Boolean status, String msg){
        super(msg);
        this.code = 403;
        this.status = status;
        this.msg = msg;
    }


    public Integer getCode() {
        return code;
    }

    public Boolean getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }
}
