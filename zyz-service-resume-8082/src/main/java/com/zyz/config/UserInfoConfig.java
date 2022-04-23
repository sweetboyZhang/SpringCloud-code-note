package com.zyz.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/23 21:52
 */
@Configuration
@Data
@RefreshScope
public class UserInfoConfig {

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private Integer age;
}
