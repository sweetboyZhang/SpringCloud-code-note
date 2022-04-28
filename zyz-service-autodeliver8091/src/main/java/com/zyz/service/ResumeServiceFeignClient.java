package com.zyz.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/19 10:09
 */
//@FeignClient(value = "zyz-service-resume",fallback = ResumeFallback.class,path = "/resume")
@FeignClient(value = "zyz-service-resume",path = "/resume")
public interface ResumeServiceFeignClient {

    @GetMapping("/getStatus/{userId}")
    String getResumeStatusByUserId(@PathVariable("userId") Integer userId);


}
