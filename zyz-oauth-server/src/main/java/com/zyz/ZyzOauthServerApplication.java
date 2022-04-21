package com.zyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/21 16:44
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAuthorizationServer
public class ZyzOauthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZyzOauthServerApplication.class,args);
    }
}
