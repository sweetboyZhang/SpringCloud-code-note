package com.zyz.controller;

import com.zyz.pojo.ResumePO;
import com.zyz.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/15 18:43
 */
@RestController
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @GetMapping("/getStatus/{userId}")
    public String getResumeStatusByUserId(@PathVariable("userId") Integer userId){

//        // 模拟耗时操作
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        ResumePO resume = resumeService.findDefaultResumeByUserId(userId);

        return resume == null ?"该用户没有还没有上传简历":
                "负载服务器端口号："+"8083 简历状态："+resume.getIsOpenResume();

    }

}
