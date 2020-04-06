package com.honor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by rongyaowen
 * on 2020/3/30.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaConsumerFeign9002Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerFeign9002Application.class, args);
    }
}
