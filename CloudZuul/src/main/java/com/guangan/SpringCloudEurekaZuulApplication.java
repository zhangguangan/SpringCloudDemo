package com.guangan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@EnableZuulProxy
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = "com.guangan")
public class SpringCloudEurekaZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaZuulApplication.class, args);
    }
}