package com.honor.controller;

import com.honor.service.IHelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by rongyaowen
 * on 2020/3/30.
 */
@RestController
public class HelloController {
    @Autowired
    private IHelloService helloService;
    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        logger.info("provider");
        return helloService.sayHello(name);
    }
}
