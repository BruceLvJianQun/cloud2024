package com.jianqun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderMain8000 {
    public static void main(String[] args) {
        System.out.println("dddddd");
        System.out.println("eeee");
        SpringApplication.run(OrderMain8000.class,args);
    }
}

