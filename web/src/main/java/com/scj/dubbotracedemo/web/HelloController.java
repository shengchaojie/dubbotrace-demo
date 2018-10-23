package com.scj.dubbotracedemo.web;

import com.scj.dubbotracedemo.api.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 10064749
 * @description ${DESCRIPTION}
 * @create 2018-10-23 14:35
 */
@RestController
@Slf4j
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(){
        log.info("test test test test");
        log.error("test test test test");
        return helloService.hello("scj");
    }

}
