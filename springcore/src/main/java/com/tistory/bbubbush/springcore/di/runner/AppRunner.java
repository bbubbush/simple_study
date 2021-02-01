package com.tistory.bbubbush.springcore.di.runner;

import com.tistory.bbubbush.springcore.di.service.impl.ApplicationLayerService;
import com.tistory.bbubbush.springcore.di.service.impl.NetworkLayerService;
import com.tistory.bbubbush.springcore.di.service.impl.SSLLayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    private SSLLayerService sslLayerService;

    private final ApplicationLayerService applicationLayerService;
    private NetworkLayerService networkLayerService;

    @Autowired
    public AppRunner(ApplicationLayerService applicationLayerService) {
        this.applicationLayerService = applicationLayerService;
        log.info("생성자!! {}", this.applicationLayerService);
    }

    public NetworkLayerService getNetworkLayerService() {
        return networkLayerService;
    }

    @Autowired
    public void setNetworkLayerService(NetworkLayerService networkLayerService) {
        this.networkLayerService = networkLayerService;
        log.info("세터!! {}", this.networkLayerService);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {


    }
}
