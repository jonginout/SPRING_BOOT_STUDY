package com.jonginout;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HumanProperties.class)
public class HumanConfiguration {

    @Bean
    @ConditionalOnMissingBean
//    이 타입이 Bean이 없을때만 이 빈을 등록해라
//    즉, 조건에 따라 빈을 등록하고
//    실제 메인 프로젝트에 Human이라는 Bean이 있으면 그것을 먼저 등록한다.
    public Human human(HumanProperties properties){ //application.properties에 있는 정보를 받아서
        Human human = new Human();
        human.setName(properties.getName());
        human.setAge(properties.getAge());
        return human;
    }

}
