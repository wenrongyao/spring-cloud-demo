package com.honor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by rongyaowen
 * on 2019/8/20.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class EurekaZuul9567Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaZuul9567Application.class, args);
    }
}
