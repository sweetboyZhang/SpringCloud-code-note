package com.zyz.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/20 11:35
 */
@Data
@Component
@RefreshScope
public class ConfigInfo {

    @Value("${config.info}")
    private String info;

}
