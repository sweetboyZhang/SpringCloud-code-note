package com.zyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/19 17:58
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZyzGatewayServerApplication8101 {
    public static void main(String[] args) {
        SpringApplication.run(ZyzGatewayServerApplication8101.class,args);
    }
}
