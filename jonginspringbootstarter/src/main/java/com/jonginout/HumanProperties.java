package com.jonginout;

import org.springframework.boot.context.properties.ConfigurationProperties;

// 그럼 메인 프로젝트에서 application.properties에서 빈등록 가능
@ConfigurationProperties("human")   // 우리가 쓸 prefix 가 인자에 들어간다.
public class HumanProperties {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
