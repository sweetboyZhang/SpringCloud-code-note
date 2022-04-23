package com.zyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/20 9:29
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ZyzConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZyzConfigServerApplication.class,args);
    }
}
