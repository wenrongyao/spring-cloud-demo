package com.honor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by rongyaowen
 * on 2020/3/30.
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaProvider8003Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider8003Application.class, args);
    }
}
