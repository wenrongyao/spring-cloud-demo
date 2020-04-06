package com.honor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by rongyaowen
 * on 2020/3/30.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class EurekaConsumerRibbonHystrix9001Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerRibbonHystrix9001Application.class, args);
    }
}
