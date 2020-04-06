package com.honor.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Created by rongyaowen
 * on 2020/4/4.
 */
@Component
public class HelloServiceFallBackFactory implements FallbackFactory<IHelloService> {
    public IHelloService create(Throwable throwable) {
        return new IHelloService() {
            public String sayHello(String name) {
                return "hello " + name + ", current service is disable, place try it later.";
            }
        };
    }
}
