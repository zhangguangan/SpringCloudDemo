package com.guangan.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-zuul", fallback = ComputeClientHystrix.class)
public interface FeignService {
    @RequestMapping("/guangan/dc")
    public String testFeign();

}
