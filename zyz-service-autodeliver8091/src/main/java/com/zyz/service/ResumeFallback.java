package com.zyz.service;

import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/19 10:48
 */
@Component
public class ResumeFallback implements ResumeServiceFeignClient{


    /**
     * 降级回退方法
     * @param userId
     * @return
     */
    @Override
    public String getResumeStatusByUserId(Integer userId) {
        return "-1";
    }
}
