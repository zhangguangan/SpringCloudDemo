package com.guangan.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${server.port}")
    private String port;

    private static final Logger logger = Logger.getLogger(ProviderController.class);

    @GetMapping("/dc")
    public String dc() {
        System.out.println("port:" + port);
        String services = port + ",Services: " + discoveryClient.getServices();
        System.out.println(services);
        Integer ms = 4000;
        try {
            Thread.sleep(ms);
        }catch (Exception e) {
            logger.error("当前线程睡眠异常，异常信息：", e);
        }
        return services;
    }
}
