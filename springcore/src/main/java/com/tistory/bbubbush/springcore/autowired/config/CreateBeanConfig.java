package com.tistory.bbubbush.springcore.autowired.config;

import com.tistory.bbubbush.springcore.autowired.service.PrimitiveService;
import com.tistory.bbubbush.springcore.autowired.service.impl.CharacterService;
import com.tistory.bbubbush.springcore.autowired.service.impl.FloatService;
import com.tistory.bbubbush.springcore.autowired.service.impl.IntegerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedList;
import java.util.List;

@Configuration
public class CreateBeanConfig {
    @Bean
    public List<PrimitiveService> primitiveServiceList() {
        return new LinkedList<PrimitiveService>() {
            {
                add(new CharacterService());
                add(new FloatService());
                add(new IntegerService());
            }
        };
    }
}
