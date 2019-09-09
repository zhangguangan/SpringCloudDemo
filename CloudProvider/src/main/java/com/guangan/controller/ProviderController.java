package com.guangan.controller;

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


    @GetMapping("/dc")
    public String dc() {
        System.out.println("port:" + port);
        String services = port + ",Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
