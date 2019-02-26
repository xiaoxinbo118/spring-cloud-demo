package com.spice.ribbon.controller;

import com.spice.ribbon.service.APIService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Created by sfht on 25/2/2019.
 */
@RestController
public class APIController {
    final static Logger logger = LoggerFactory.getLogger(APIService.class);

    @Autowired
    APIService service;

    @GetMapping(value = "/m.api")
    public Object execute(HttpServletRequest request) {
        String serviceName = request.getParameter("_sv");
        String methodName = request.getParameter("_mt");
        logger.info("serverName=" + serviceName);
        logger.info("methodName=" + methodName);
        Enumeration<String> names = request.getParameterNames();
        StringBuilder params = new StringBuilder();

        // todo 参数判断
        // TODO 异步
        // todo 多参数
        while(names.hasMoreElements()) {
            String name = names.nextElement();
            String value = request.getParameter(name);
            params.append(name);
            params.append("=");
            params.append(value);
            params.append("&");
        }

        return service.executeApi(serviceName, methodName, params.toString());
    }

    @GetMapping(value = "/saveUserInfo")
    public Object saveUserInfo() {
        return service.saveUserInfo();
    }
}
