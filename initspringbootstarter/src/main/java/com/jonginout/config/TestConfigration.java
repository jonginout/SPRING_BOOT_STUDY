package com.jonginout.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class TestConfigration {

    @Bean
    public String hello(){
        return "hello test";
    }

}
