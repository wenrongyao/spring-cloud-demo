package com.honor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by rongyaowen
 * on 2020/3/30.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class EurekaConsumerFeignHystrix9002Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerFeignHystrix9002Application.class, args);
    }
}
