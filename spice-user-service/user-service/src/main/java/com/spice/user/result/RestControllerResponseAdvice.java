package com.spice.user.result;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * Created by sfht on 22/2/2019.
 */
@ControllerAdvice
public class RestControllerResponseAdvice implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
                                  ServerHttpResponse response) {
        // 对body进行封装处理
        if (body instanceof ExceptionEntity) {
            ExceptionEntity exception = (ExceptionEntity)body;
            ResponseResultEntity<Object> result = new ResponseResultEntity<Object>();
            result.setCode(exception.getCode());
            result.setMsg(exception.getMsg());
            return result;
        } else if (body instanceof Object) {
            ResponseResultEntity<Object> result = new ResponseResultEntity<Object>();
            result.setData(body);
            return result;
        }

        return body;
    }
}
