package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author AoDeng
 * @date 9:59 21-9-26
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.demo.feignclient")
public class ProviderApplication {

    @LoadBalanced
    @Bean
    public RestTemplate lb() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
