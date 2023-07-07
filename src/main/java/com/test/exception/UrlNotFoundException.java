package com.test.exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UrlNotFoundException implements ErrorController {
    @RequestMapping("/error")
    public R handle404Error() {
        // 处理自定义的url错误 404 错误逻辑
        return new R(ExceptionEnum.URL_NOT_FOUND);
    }
}
