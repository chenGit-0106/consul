package com.chenteng.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulApplication1.class);
    }
}
