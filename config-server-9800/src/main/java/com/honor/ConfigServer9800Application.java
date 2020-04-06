package com.honor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by rongyaowen
 * on 2020/4/6.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer9800Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer9800Application.class, args);
    }
}
