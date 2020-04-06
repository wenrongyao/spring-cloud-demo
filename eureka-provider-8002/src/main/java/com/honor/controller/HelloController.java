package com.honor.controller;

import com.honor.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rongyaowen
 * on 2020/3/30.
 */
@RestController
public class HelloController {
    @Autowired
    private IHelloService helloService;

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return helloService.sayHello(name);
    }
}
