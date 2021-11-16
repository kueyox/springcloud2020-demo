package com.demo.controller;

import com.demo.feignclient.ProviderClientOne;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author AoDeng
 * @date 10:02 21-9-26
 */
@RestController
@Slf4j
public class DemoController {

    @Autowired
    private ProviderClientOne providerClientOne;

    @Value("${server.port}")
    String port;

    @GetMapping("getInfoBy2")
    public String getInfoBy2(@RequestParam(value = "name",defaultValue = "nacosConfig",required = false)String name){
        //return "my name is "+name+",my port is "+port;
        return providerClientOne.getInfo(name);
    }

    @GetMapping("/traceB")
    public String traceB() {
        log.info("-------- traceB -------");
        return "traceB";
    }
}
