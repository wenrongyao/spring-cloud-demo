package com.custom.config;

import com.custom.rule.MyRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rongyaowen
 * on 2020/4/2.
 * 针对eureka-provider做的ribbon客户端配置
 */
@Configuration
public class EurekaProviderServiceConfig {
    @Bean
    public IRule getRule() {
        //return new RandomRule();
        return new MyRule();
    }
}
