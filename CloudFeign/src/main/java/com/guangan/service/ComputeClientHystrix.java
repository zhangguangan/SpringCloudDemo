package com.guangan.service;

import org.springframework.stereotype.Component;

@Component
public class ComputeClientHystrix implements FeignService {
    @Override
    public String testFeign() {
        return "service is error";
    }
}
