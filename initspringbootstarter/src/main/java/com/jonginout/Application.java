package com.jonginout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
//        app.setWebApplicationType(WebApplicationType.SERVLET);  // 서블릿(기본)
//        app.setWebApplicationType(WebApplicationType.REACTIVE);// 서블릿이 없고 웹 리엑티브만 있으면 리엑티브
        app.setWebApplicationType(WebApplicationType.NONE);     // 둘다 없으면 NONE // 웹서버를 안쓸때
        app.addListeners(new SampleListener());
        app.run(args);
    }

}
