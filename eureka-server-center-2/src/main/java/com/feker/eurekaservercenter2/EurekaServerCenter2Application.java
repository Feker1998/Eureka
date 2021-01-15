package com.feker.eurekaservercenter2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerCenter2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerCenter2Application.class, args);
    }

}
