package com.spice.user.result;

import com.spice.user.SpiceException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by sfht on 22/2/2019.
 */
@RestControllerAdvice
public class ExceptionResponseAdvice {
    /**
     * @param e     异常
     * @description 处理所有不可知的异常
     */
    @ExceptionHandler({Exception.class})    //申明捕获那个异常类
    public ExceptionEntity globalExceptionHandler(Exception e) {
        // TODO 日志输出
        ExceptionEntity response = new ExceptionEntity();
        response.setCode(-100);
        response.setMsg("服务器未知异常");
        return response;
    }

    @ExceptionHandler({MissingServletRequestParameterException.class})
    public ExceptionEntity paramExceptionHandler(MissingServletRequestParameterException e) {
        // TODO 日志输出
        ExceptionEntity response = new ExceptionEntity();
        response.setCode(-104);
        response.setMsg("参数错误");
        return response;
    }

    /**
     * @param e 异常
     * @description 处理所有业务异常
     */
    @ExceptionHandler({SpiceException.class})
    public ExceptionEntity spiceExceptionHandler(SpiceException e) {
//        this.logger.error(e);
        // TODO 日志输出
        ExceptionEntity response = new ExceptionEntity();
        response.setCode(e.getCode());
        response.setMsg(e.getMessage());
        return response;
    }
}
