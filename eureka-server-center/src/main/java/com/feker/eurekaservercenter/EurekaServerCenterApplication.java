package com.feker.eurekaservercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication

@EnableEurekaServer
public class EurekaServerCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerCenterApplication.class, args);
    }

}
