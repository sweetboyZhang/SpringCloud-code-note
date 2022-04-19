package com.zyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/15 18:55
 */
// @SpringCloudApplication = @SpringBootApplication + @EnableDiscoveryClient + @EnableCircuitBreaker
@SpringBootApplication
@EnableDiscoveryClient
// @EnableCircuitBreaker
@EnableFeignClients // 包含熔断器
public class ZyzServiceAutodeliverApplication8091 {
    public static void main(String[] args) {
        SpringApplication.run(ZyzServiceAutodeliverApplication8091.class, args);
    }

}
