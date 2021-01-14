package com.feker.serviceproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProducerApplication.class, args);
    }

}
