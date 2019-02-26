package com.spice.ribbon.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sfht on 25/2/2019.
 */
@Service
public class APIService {
    final static Logger logger = LoggerFactory.getLogger(APIService.class);

    @Autowired
    RestTemplate restTemplate;

    public Object executeApi(String serviceName, String methodName, String params) {
        logger.info("serverName=" + serviceName);
        logger.info("methodName=" + methodName);
        logger.info("service=" + "http://" + serviceName + "-service/" + methodName + "?" + params);
        return restTemplate.getForObject("http://" + serviceName + "-service/" + methodName + "?" + params, Object.class);
    }

    public Object saveUserInfo() {
        return restTemplate.getForObject("http://user-service/saveUserInfo", Object.class);
    }
}
