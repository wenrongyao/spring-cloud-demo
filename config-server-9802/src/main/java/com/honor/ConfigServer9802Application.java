package com.honor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Created by rongyaowen
 * on 2020/4/6.
 */
@SpringBootApplication
@EnableConfigServer
@RefreshScope  // 总线刷新
public class ConfigServer9802Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer9802Application.class, args);
    }
}
