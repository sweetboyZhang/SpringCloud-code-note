package com.zyz.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.sql.ResultSet;
import java.util.List;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/15 19:12
 */
@RestController
@RequestMapping("/autodeliver")
public class AutodeliverController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @HystrixCommand(
            threadPoolKey = "findResumeOpenStatus",
            threadPoolProperties = {
                    @HystrixProperty(name = "coreSize", value = "1"),
                    @HystrixProperty(name = "maxQueueSize", value = "20")
            },
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")},
            fallbackMethod = "hystrixFallback"
    )
    @GetMapping("/findResumeOpenStatus/{userId}")
    public String findResumeOpenStatus(@PathVariable("userId") Integer userId) {

        List<ServiceInstance> instances = discoveryClient.getInstances("ZYZ-SERVICE-RESUME");
        ServiceInstance serviceInstance = instances.get(0);
        // String host = serviceInstance.getHost();
        // int port = serviceInstance.getPort();
        // 使用服务名称才能进行负载
        String url = "http://ZYZ-SERVICE-RESUME/" + "/resume/getStatus/" + userId;
        return restTemplate.getForObject(url, String.class);
    }

    // 返回值类型与参数类型与原方法保持一致
    public String hystrixFallback(Integer userId) {
        return "熔断回调方法";
    }


    /**
     * 8秒钟内，请求次数达到2个，并且失败率在50%以上，就跳闸
     * 跳闸后活动窗⼝设置为3s
     */
    @HystrixCommand(
            threadPoolKey = "testHystrix",
            threadPoolProperties = {
                    @HystrixProperty(name = "coreSize", value = "2"),
                    @HystrixProperty(name = "maxQueueSize", value = "20")
            },
            commandProperties = {
                    @HystrixProperty(name =
                            "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
                    @HystrixProperty(name =
                            "metrics.rollingStats.timeInMilliseconds", value = "8000"),
                    @HystrixProperty(name =
                            "circuitBreaker.requestVolumeThreshold", value = "2"),
                    @HystrixProperty(name =
                            "circuitBreaker.errorThresholdPercentage", value = "50"),
                    @HystrixProperty(name =
                            "circuitBreaker.sleepWindowInMilliseconds", value = "3000"),
            },
            fallbackMethod = "hystrixFallback"
    )
    @GetMapping("/testHystrix/{userId}")
    public String testHystrix(@PathVariable("userId") Integer userId) {

        List<ServiceInstance> instances = discoveryClient.getInstances("ZYZ-SERVICE-RESUME");
        ServiceInstance serviceInstance = instances.get(0);
        String url = "http://ZYZ-SERVICE-RESUME/" + "/resume/getStatus/" + userId;
        return restTemplate.getForObject(url, String.class);
    }

}
