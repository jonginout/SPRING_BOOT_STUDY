package com.jonginout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HumanRunner implements ApplicationRunner {

    @Autowired
    Human human;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(human);
    }
}
