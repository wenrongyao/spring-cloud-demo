package com.honor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rongyaowen
 * on 2020/4/6.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ConfigClient9900Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient9900Application.class, args);
    }

    // 配置文件注入
    @Value("${foo}")
    private String foo;
    @Value("${label:master}")
    private String label;

    @GetMapping("/getconfig")
    public String getConfig() {
        return "Current label is " + label + ", and the foo content is " + foo + ".";
    }
}
