package com.zyz.controller;

import com.zyz.pojo.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/20 11:38
 */
@RestController
public class TestConfigController {


    @Autowired
    private ConfigInfo configInfo;

    @GetMapping("/getConfigInfo")
    public String getConfigInfo(){
        return configInfo.getInfo();
    }

}
