package com.zyz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

/**
 * @Description 认证服务器配置
 * @Author zhangyuzhen
 * @Since JDK 1.8
 * @Version V1.0
 * @Date 2022/4/21 16:50
 */
@Configuration
public class OauthServerConfig extends AuthorizationServerConfigurerAdapter {

    /**
     * 配置接口访问权限
     * @param security
     * @throws Exception
     */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        super.configure(security);
    }

    /**
     * 配置客户端详情 clientId,clientSecret
     * @param clients
     * @throws Exception
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        super.configure(clients);
        // 先写死在内存中
        clients.inMemory().withClient("client_zyz").secret("2824199842")
                .resourceIds("autodeliver").authorizedGrantTypes("password","refresh_token")
                .scopes("all");
    }

    /**
     * 配置token token的存储
     * @param endpoints
     * @throws Exception
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        super.configure(endpoints);
    }
}
