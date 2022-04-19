package com.zyz.dao;

import com.zyz.pojo.ResumePO;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/15 17:40
 */
public interface ResumeMapper {

    ResumePO findByUserId(Integer userId);


}
