package com.honor.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rongyaowen
 * on 2020/4/5.
 * ribbon的客户端配置
 */
@Configuration
public class RibbonClientConfig {
    @Bean
    public IRule getRule() {
        return new RandomRule();
    }
}
