package com.tistory.bbubbush.springcore.scope.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;

@Configuration
@Slf4j
public class BeanConfig {
    @Bean
    public SingletonBean singletonBean() {
        return new SingletonBean();
    }

    @Bean
//    @Scope("prototype")
    @Lookup
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }

    @Bean
    public BeanPostProcessor beanPostProcessor() {
        return new BeanPostProcessor() {
            @Override
            public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
                log.info("before beanName ::{}", beanName);
                return bean;
            }

            @Override
            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
                log.info("after beanName ::{}", beanName);
                return bean;
            }
        };
    }

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return configurableListableBeanFactory -> {
            log.info("BeanFactoryPostProcessor :: {}", configurableListableBeanFactory);
        };
    }

    @PostConstruct
    public void postConstruct() {
        log.info("Post construct!!!");
    }
}
