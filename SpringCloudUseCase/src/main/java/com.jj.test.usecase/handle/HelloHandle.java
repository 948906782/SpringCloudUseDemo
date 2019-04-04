package com.jj.test.usecase.handle;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * Created on 2019/4/3.
 *
 * @author Mr SysYe
 */
@RestController
@RequestMapping("test")
public class HelloHandle {
    @GetMapping(value = "hello",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Flux<String> sayHello(){
        return Flux.just("HELLO WORLD");
    }
}
