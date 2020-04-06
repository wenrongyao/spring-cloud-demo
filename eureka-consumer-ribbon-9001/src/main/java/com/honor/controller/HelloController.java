package com.honor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by rongyaowen
 * on 2020/3/30.
 */
@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;
    // 服务提供方
    private final static String HELLO_SERVICE_NAME = "http://eureka-provider/";

    @RequestMapping("/hello/{name}")
    public String sayHello(String name) {
        return restTemplate.getForObject(HELLO_SERVICE_NAME + "hello/" + name, String.class);
    }
}
