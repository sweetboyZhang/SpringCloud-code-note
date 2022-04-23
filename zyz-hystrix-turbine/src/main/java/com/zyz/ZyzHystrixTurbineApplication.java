package com.zyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/18 22:00
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
public class ZyzHystrixTurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZyzHystrixTurbineApplication.class, args);
    }
}
