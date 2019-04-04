package com.jj.test.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created on 2019/4/4.
 *  启动入口
 * @author Mr SysYe
 */
@SpringBootApplication
@EnableEurekaClient
public class SecurityApp {
    public static void main(String[] args) {
        SpringApplication.run(SecurityApp.class,args);
    }
}
