package com.jonginout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleApplicationRunner implements ApplicationRunner {
    // ApplicationRunner 어플리케이션이 실행하고 추가적으로 또 뭔가를 실행 시키고 싶을때

    @Autowired
    JonginoutProperties jonginoutProperties;

    @Autowired
    private String hello;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===============================");
        System.out.println(jonginoutProperties.getFullName());
        System.out.println(jonginoutProperties.getAge());
        System.out.println(hello);
        System.out.println("===============================");
    }
}
