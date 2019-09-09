package com.guangan.controller;

import com.guangan.service.FeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignController {
    @Resource
    private FeignService feignService;

    @RequestMapping("feignTest")
    public String feignTest() {
        return feignService.testFeign();
    }
}
