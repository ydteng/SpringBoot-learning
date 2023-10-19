package com.springbootInit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 全局异常处理程序
 *
 * @author ydteng
 * @date 2023/08/12
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private final String formattedDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    /**
     * 系统异常
     *
     * @param e e
     * @return {@link R}
     */
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<R> systemException(Exception e){
        System.out.println("error start---------------------------------------------------------------------------");
        System.out.println("错误时间/error time : " + formattedDateTime);
        System.out.println("错误消息:"+e.getMessage());
        System.out.println("error end---------------------------------------------------------------------------");
        System.out.println("堆栈跟踪:");
        e.printStackTrace();    //显示堆栈错误跟踪
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new R("系统内部异常，请联系管理员"));
    }

    /**
     * 自定义异常
     *
     * @param e e
     * @return {@link ResponseEntity}<{@link R}>
     */
    @ExceptionHandler(value = MyExceptionHandler.class)
    public ResponseEntity<R> customException(MyExceptionHandler e){
        ResponseEntity<R> responseEntity = ResponseEntity.status(e.getStatusCode()).body(new R(e.getMsg()));
        System.out.println("error start---------------------------------------------------------------------------");
        System.out.println("错误时间/error time : " + formattedDateTime);
        System.out.println("错误消息:"+e.getMsg());
        System.out.println("错误实体类:");
        System.out.println(responseEntity.getBody());
        System.out.println("error end---------------------------------------------------------------------------");
        System.out.println("堆栈跟踪:");
        e.printStackTrace();    //显示堆栈错误跟踪

        return responseEntity;

    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public ResponseEntity<R> validationException(BindException e){
        ResponseEntity<R> responseEntity = ResponseEntity.status(HttpStatus.FORBIDDEN).body(new R((e.getFieldError().getDefaultMessage())));
        System.out.println("error start---------------------------------------------------------------------------");
        System.out.println("错误时间/error time : " + formattedDateTime);
        System.out.println("错误消息:"+e.getFieldError().getDefaultMessage());
        System.out.println("错误实体类:");
        System.out.println(responseEntity.getBody());
        System.out.println("error end---------------------------------------------------------------------------");
        System.out.println("堆栈跟踪:");
        e.printStackTrace();    //显示堆栈错误跟踪
        return responseEntity;
    }
}
