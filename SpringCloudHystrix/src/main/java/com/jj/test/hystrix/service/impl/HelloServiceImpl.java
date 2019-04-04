package com.jj.test.hystrix.service.impl;

import com.jj.test.hystrix.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created on 2019/4/4.
 *
 * @author Mr SysYe
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallbacker",commandKey="sayHello",groupKey="sayHello",
            threadPoolKey="sayHello")
    @Override
    public String getHello() {
        return restTemplate.getForEntity("http://Springcloud-UseCase:8001/test/hello",String.class).getBody();
    }
    public String fallbacker(){
        return "error";
    }
}
