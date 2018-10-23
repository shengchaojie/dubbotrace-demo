package com.scj.dubbotracedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author 10064749
 * @description ${DESCRIPTION}
 * @create 2018-10-23 13:59
 */
@SpringBootApplication
@ImportResource(locations = "classpath:dubbo-provider.xml")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
