package com.chenteng.consul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("test")
    public String test(){
        return "this is my test111111";
    }
}