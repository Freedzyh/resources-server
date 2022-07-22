package com.example.resourcesserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.example")
@ComponentScan(basePackages = "com.example")
public class ResourcesServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResourcesServerApplication.class, args);
    }

}
