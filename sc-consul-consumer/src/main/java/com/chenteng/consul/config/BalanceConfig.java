package com.chenteng.consul.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BalanceConfig {

    @Bean
    public IRule MyRule(){
        /*指定随机的负载均衡算法*/
        return new RandomRule();
        /*轮询*/
       // return new RoundRobinRule();
    }
}
