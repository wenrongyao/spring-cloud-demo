package com.honor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by rongyaowen
 * on 2020/4/4.
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class EurekaConsumeHystrixDashbord10001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumeHystrixDashbord10001.class, args);
    }
}
