package com.honor.service;

import org.springframework.stereotype.Component;

/**
 * Created by rongyaowen
 * on 2020/4/4.
 */
//@Component
public class HelloServiceFallBack implements IHelloService {
    public String sayHello(String name) {
        return "hello " + name + ", current service is disable, place try it later.";
    }
}
