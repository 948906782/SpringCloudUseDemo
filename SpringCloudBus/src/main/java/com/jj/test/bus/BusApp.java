package com.jj.test.bus;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created on 2019/4/4.
 *
 * @author Mr SysYe
 */
@SpringBootApplication
@EnableEurekaClient
@EnableRabbit
public class BusApp {
    public static void main(String[] args) {
        SpringApplication.run(BusApp.class,args);
    }
}
