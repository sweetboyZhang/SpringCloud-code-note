package com.zyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/16 16:56
 */
@SpringBootApplication
@EnableEurekaServer
public class ZyzEurekaServerApplication8761 {
    public static void main(String[] args) {
        SpringApplication.run(ZyzEurekaServerApplication8761.class,args);
    }
}
