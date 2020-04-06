package com.honor.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by rongyaowen
 * on 2020/3/31.
 */
@FeignClient(value = "eureka-provider", fallbackFactory = HelloServiceFallBackFactory.class)
//@FeignClient(value = "eureka-provider", fallback = HelloServiceFallBack.class)
public interface IHelloService {
    /**
     * 打招呼
     *
     * @param name bb侠
     * @return
     */
    @GetMapping("/hello/{name}")
    // @PathVariable必须包含名称，不然无法启动
    String sayHello(@PathVariable("name") String name);
}
