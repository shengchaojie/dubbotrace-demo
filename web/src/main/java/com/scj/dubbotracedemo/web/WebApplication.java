package com.scj.dubbotracedemo.web;

import com.scj.dubbotrace.filter.TraceFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 * @author 10064749
 * @description ${DESCRIPTION}
 * @create 2018-10-23 14:31
 */
@SpringBootApplication
@ImportResource(locations = "classpath:dubbo-consumer.xml")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class,args);
    }

    @Bean
    public FilterRegistrationBean traceFilter(){
        FilterRegistrationBean registration = new FilterRegistrationBean(new TraceFilter());
        registration.addUrlPatterns("/*");
        registration.setName("traceFilter");
        return registration;
    }
}
