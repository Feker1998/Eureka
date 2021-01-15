package com.feker.eurekaservercenter3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerCenter3Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerCenter3Application.class, args);
    }

}
