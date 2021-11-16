package com.demo.controller;

import com.demo.service.ProviderClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author AoDeng
 * @date 10:15 21-9-26
 */
@RestController
@Slf4j
public class DemoController {
    @Autowired
    private ProviderClient providerClient;

    @GetMapping("getInfoByFeign")
    public String getInfoByFeign(){
        return providerClient.getInfoBy2("consumer feign");
    }

    @GetMapping("/traceA")
    public String traceA() {
        log.info("-------- traceA -------");
        return providerClient.traceB();
    }
}
