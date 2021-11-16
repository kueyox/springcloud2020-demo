package com.demo.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description TODO
 * @author: Administrator
 * @create: 2021-11-15 20:26:40
 **/
@FeignClient(value = "provider-2")
public interface ProviderClientOne {
    @GetMapping("getInfo")
    String getInfo(@RequestParam(value = "name",defaultValue = "nacosConfig",required = false)String name);
}
