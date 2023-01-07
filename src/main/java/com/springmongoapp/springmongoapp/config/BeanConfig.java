package com.springmongoapp.springmongoapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Test test() {
        System.out.println("configuration class test method called");
        return new Test();
    }
}
