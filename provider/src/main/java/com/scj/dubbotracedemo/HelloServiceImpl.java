package com.scj.dubbotracedemo;

import com.scj.dubbotracedemo.api.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 10064749
 * @description ${DESCRIPTION}
 * @create 2018-10-23 13:55
 */
@Service
@Slf4j
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        log.info("invoked invoked invoked");
        return "hello"+name;
    }
}
