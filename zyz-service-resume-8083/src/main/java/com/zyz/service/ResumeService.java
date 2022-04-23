package com.zyz.service;

import com.zyz.pojo.ResumePO;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/15 18:00
 */
public interface ResumeService {

    ResumePO findDefaultResumeByUserId(Integer userId);
}
