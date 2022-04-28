package com.zyz.service.impl;

import com.zyz.dao.ResumeMapper;
import com.zyz.pojo.ResumePO;
import com.zyz.service.ResumeService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/15 18:02
 */
@DubboService // 暴露服务，并注册到注册中心
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeMapper resumeMapper;


    @Override
    public ResumePO findDefaultResumeByUserId(Integer userId) {
        return resumeMapper.findByUserId(userId);
    }
}
