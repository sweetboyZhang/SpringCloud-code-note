package com.zyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/18 20:34
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrixDashboard
public class ZyzHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZyzHystrixDashboardApplication.class,args);
    }

}
