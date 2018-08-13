package com.jonginout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    /*
        // 여기서 등록한 빈보다 무조건
        // 컴포넌트 스캔으로 Bean을 등록한게 먼저 등록된다.
        @Bean
        public Human human(){
            Human human = new Human();
            human.setName("김종은");
            human.setAge(21);
            return human;
        }
        // 이렇게 굳이 Bean 설정을 장황하게 하고 싶은가??
        // 해결책 : application.properties에 간단하게 빈등록을 해도 된다
    */
}
