package com.springbootInit.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * 自定义异常处理程序
 * 注意：此类中若使用@Data注解，会提示找不到方法，可能与异常处理类的运行机制有关。
 *
 * @author ydteng
 * @date 2023/08/12
 */

@Data
public class MyExceptionHandler extends RuntimeException{
    private HttpStatus statusCode;
    private Boolean status;
    private String msg ;

    /**
     * 此构造函数用于枚举中已有的异常
     *
     * @param exceptionEnum 异常枚举
     */
    public MyExceptionHandler(ExceptionEnum exceptionEnum){
        super();
        this.statusCode = exceptionEnum.getResultCode();
        this.status = exceptionEnum.getResultStatus();
        this.msg = exceptionEnum.getResultMsg();
    }

    /**
     * 完全自定义异常处理程序
     *
     * @param statusCode 状态码
     * @param status     状态
     * @param msg        消息
     */
    public MyExceptionHandler(HttpStatus statusCode, Boolean status, String msg){
        super(msg);
        this.statusCode = statusCode;
        this.status = status;
        this.msg = msg;
    }

    /**
     * 用于其他服务器拒绝但是不容易分类的情况，，所以单独一个
     *
     * @param status 状态
     * @param msg    消息
     */
    public MyExceptionHandler(Boolean status, String msg){
        super(msg);
        this.statusCode = HttpStatus.FORBIDDEN;
        this.status = status;
        this.msg = msg;
    }

//    public HttpStatus getStatusCode() {
//        return statusCode;
//    }
//
//    public void setStatusCode(HttpStatus statusCode) {
//        this.statusCode = statusCode;
//    }
//
//    public Boolean getStatus() {
//        return status;
//    }
//
//    public void setStatus(Boolean status) {
//        this.status = status;
//    }
//
//    public String getMsg() {
//        return msg;
//    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }
}
