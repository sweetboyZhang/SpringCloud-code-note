package com.zyz.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/20 8:43
 */
@Slf4j
@Component
public class BlackListFilter implements GlobalFilter, Ordered {


    /**
     * 模拟IP黑名单数据
     */
    private static List<String> blackList = new ArrayList<>();

    static {
        blackList.add("0:0:0:0:0:0:0:1");

    }

    /**
     * 过滤器核心方法
     *
     * @param exchange 封装了 request 和 response 上下文
     * @param chain    网关过滤器链 包含全局过滤器和单路由过滤器
     * @return
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();

        String ip = request.getRemoteAddress().getHostString();
        if (blackList.contains(ip)) {
            ServerHttpResponse response = exchange.getResponse();
            response.setStatusCode(HttpStatus.FORBIDDEN);
            log.info(ip + "=====此IP拒绝访问");
            return response.writeWith(Mono.just(response.bufferFactory().wrap("Request Forbidden".getBytes())));
        }

        // 放行
        return chain.filter(exchange);
    }


    /**
     * 过滤器优先级
     *
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
