package com.tistory.bbubbush.springcore.autowired.runner;

import com.tistory.bbubbush.springcore.autowired.service.PrimitiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Component(value = "autowiredAppRunner")
public class AppRunner implements ApplicationRunner {
    @Autowired
    Optional<List<PrimitiveService>> primitiveServices;

    @Autowired
    Optional<List<PrimitiveService>> primitiveServiceList;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        primitiveServices.orElse(new LinkedList<>()).forEach(System.out::println);

        primitiveServiceList.orElse(new LinkedList<>()).forEach(System.out::println);

    }
}
