package com.tistory.bbubbush.springcore.scope.runner;

import com.tistory.bbubbush.springcore.scope.bean.PrototypeBean;
import com.tistory.bbubbush.springcore.scope.bean.SingletonBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component(value="scopeAppRunner")
@Slf4j
public class AppRunner implements ApplicationRunner {
    @Autowired
    private SingletonBean singletonBean;
    @Autowired
    private PrototypeBean prototypeBean;
    @Autowired
    ApplicationContext context;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
        log.info("{}", singletonBean);
        log.info("{}", prototypeBean);
        log.info("{}", singletonBean1);
        log.info("{}", prototypeBean1);


    }
}
