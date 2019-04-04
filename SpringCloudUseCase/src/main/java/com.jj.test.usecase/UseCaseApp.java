package com.jj.test.usecase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

/**
 * Created on 2019/4/3.
 *
 * @author Mr SysYe
 */
@SpringBootApplication
@EnableWebFlux
public class UseCaseApp {
    public static void main(String[] args) {
        SpringApplication.run(UseCaseApp.class,args);
    }
}
