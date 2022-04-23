package com.zyz.controller;

import com.zyz.config.UserInfoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/23 19:43
 */
@RestController
@RequestMapping("/user")
public class UserController {

   @Autowired
   private UserInfoConfig userInfoConfig;

    @GetMapping("/getUserInfo")
    public String getUserInfo() {
        return "I'm " + userInfoConfig.getName() + ", my age is " + userInfoConfig.getAge();
    }
}
