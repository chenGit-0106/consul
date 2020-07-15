package com.chenteng.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulApplication2.class);
    }
}
