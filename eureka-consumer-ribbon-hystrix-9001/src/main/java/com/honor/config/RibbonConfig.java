package com.honor.config;

import com.custom.config.EurekaProviderServiceConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rongyaowen
 * on 2020/3/31.
 * ribbon客户端配置
 */
@Configuration
//@RibbonClient(name = "eureka-provider", configuration = EurekaProviderServiceConfig.class)
public class RibbonConfig {

}
