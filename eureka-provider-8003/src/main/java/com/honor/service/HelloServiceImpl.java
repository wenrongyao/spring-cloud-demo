package com.honor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by rongyaowen
 * on 2020/3/31.
 */
@Service
public class HelloServiceImpl implements IHelloService {
    @Autowired
    private HttpServletRequest request;

    public String sayHello(String name) {
        return "Hello " + name + ", This port is " + request.getServerPort();
    }
}
