package com.meroot.fastpassservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FastpassServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastpassServiceApplication.class, args);
    }

}
