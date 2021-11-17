package com.demo.controller;

import com.demo.entity.OrangeDevUser;
import com.demo.service.OrangeDevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AoDeng
 * @date 10:02 21-9-26
 */
@RestController
public class DemoController {
    @Value("${server.port}")
    String port;

    @Autowired
    private OrangeDevUserService orangeDevUserService;

    @GetMapping("getInfo")
    public String getInfo(@RequestParam(value = "name",defaultValue = "nacosConfig",required = false)String name){
        return "my name is "+name+",my port is "+port;
    }

    @GetMapping("getUserById")
    public OrangeDevUser getUserById(@RequestParam(value = "id",defaultValue = "1",required = false)Integer id){
        return orangeDevUserService.selectByPrimaryKey(id);
    }


}
