package com.zyz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/15 18:55
 */
@SpringBootApplication
@MapperScan(basePackages = "com.zyz.dao")
@EnableDiscoveryClient
public class ZyzServiceResumeApplication8082 {
    public static void main(String[] args) {
        SpringApplication.run(ZyzServiceResumeApplication8082.class,args);
    }
}
