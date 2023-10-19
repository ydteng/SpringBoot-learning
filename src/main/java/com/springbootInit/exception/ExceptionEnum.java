package com.springbootInit.exception;

import org.springframework.http.HttpStatus;

/**
 * 异常枚举,此类在小型项目中用得不错，但是为了后期扩展性，还是加上。
 *
 * @author ydteng
 * @date 2023/08/12
 */
public enum ExceptionEnum{

    SUCCESS(HttpStatus.OK, true, "成功！"),
    SIGNATURE_NOT_MATCH(HttpStatus.FORBIDDEN,false,"服务器拒绝访问！"),
    NOT_FOUND(HttpStatus.NOT_FOUND, false,"未找到该资源!"),
    URL_NOT_FOUND(HttpStatus.NOT_FOUND, false,"URL资源不存在，请检查路径是否正确！"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, false,"服务器内部错误，请联系服务器管理员！");

    private final HttpStatus statusCode;
    private final Boolean status;
    private final String msg;

    ExceptionEnum(HttpStatus statusCode, Boolean status, String msg) {
        this.statusCode = statusCode;
        this.status = status;
        this.msg = msg;
    }



    public HttpStatus getResultCode() { return statusCode;  }
    public Boolean getResultStatus() { return status; }
    public String getResultMsg() {
        return msg;
    }
}
