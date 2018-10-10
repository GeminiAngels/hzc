package com.hzcf.hzc.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author baiyun
 *         获取用户信息也是通过这个应用实现
 *         这里既是认证服务器，也是资源服务器
 *         EnableResourceServer
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan(basePackages = {"com.hzcf.hzc.auth", "com.hzcf.hzc.common.bean"})
public class HzcAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzcAuthServerApplication.class, args);
    }

}
