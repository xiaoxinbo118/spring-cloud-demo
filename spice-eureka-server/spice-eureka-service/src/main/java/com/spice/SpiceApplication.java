package com.spice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by sfht on 13/2/2019.
 */
@EnableEurekaServer
@SpringBootApplication
public class SpiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpiceApplication.class, args);
    }
}
