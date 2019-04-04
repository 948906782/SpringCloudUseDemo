package com.jj.test.hystrix.handle;

import com.jj.test.hystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * Created on 2019/4/4.
 *
 * @author Mr SysYe
 */
@RequestMapping("test")
@RestController
public class HelloHandle {

    @Autowired
    HelloService helloService;

    @GetMapping("sayhello")
    public Flux<String> sayHello(){
        return Flux.just(helloService.getHello());
    }
}
