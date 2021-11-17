package com.demo.controller;

import com.demo.entity.OrangeDevUser;
import com.demo.service.Provider2Client;
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

    @Autowired
    private Provider2Client provider2Client;

    @GetMapping("getInfoByFeign")
    public String getInfoByFeign(){
        return providerClient.getInfoBy2("consumer feign");
    }

    @GetMapping("/traceA")
    public String traceA() {
        log.info("-------- traceA -------");
        return providerClient.traceB();
    }

    @GetMapping("getUserByIdFeign")
    public OrangeDevUser getUserByIdFeign(Integer id){
        return provider2Client.getUserById(id);
    }
}
