package com.jonginout;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

public class SampleListener implements ApplicationListener<ApplicationStartingEvent> {
    // 다른 이벤트는 괜찮은데 ApplicationStartingEvent는 application 컨텍스트가 만들어 지기 이전에
    // 발생하는 이벤트라 @Component를 읽지를 못한다.
    // 이런 경우는 따로 Bean 등록을 해줘야 한다.
    // ApplicationStartingEvent외 다른 이벤트는 그냥 해도 된다.

    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("==============================");
        System.out.println("어플리케이션이 시작...");
        System.out.println("==============================");
    }

}
