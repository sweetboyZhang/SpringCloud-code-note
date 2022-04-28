package com.zyz.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/28 10:10
 */
public class SentinelHandler {


    public static String handleException(Integer userId, BlockException blockException) {
        return "触发自定义降级处理";
    }



    public static String handleJavaException(Integer userId) {
        return "Java异常处理";
    }
}
