package com.demo.service;

import com.demo.entity.OrangeDevUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description TODO
 * @author: Administrator
 * @create: 2021-11-17 10:25:17
 **/
@FeignClient("provider-2")
public interface Provider2Client {

    @GetMapping("getUserById")
    OrangeDevUser getUserById(@RequestParam(value = "id",defaultValue = "1",required = false)Integer id);

}
