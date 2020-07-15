package com.chenteng.consul.controller;

import com.chenteng.consul.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //@RefreshScope动态刷新配置
public class TestController {

    @Autowired
    private MyConfig myConfig;

    @Value("${myNameKey:zhangsan}")
    private String myName;

    @RequestMapping("testkey")
    public String test(){
        return  myName;
    }

    @RequestMapping("myconfig")
    public MyConfig myconfig(){
        return  myConfig;
    }

}
