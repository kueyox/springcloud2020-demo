package com.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author AoDeng
 * @date 10:10 21-9-26
 */
@FeignClient(value = "provider")
public interface ProviderClient {

    @GetMapping("getInfoBy2")
    String getInfoBy2(@RequestParam(value = "name",defaultValue = "nacosConfig",required = false)String name);

    @GetMapping("/traceB")
    String traceB();

}

