package com.example.msatutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsAtutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsAtutorialApplication.class, args);
    }

}
