/*
 *    Copyright (c) 2018-2025, baiyun All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the hzcf4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: baiyun (GeminiAngels@163.com)
 */

package com.hzcf.hzc.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

/**
 * @author baiyun
 * @date 2018-01-24
 * zipkin mysql 存储实现
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class HzcZipkinDbApplication {
    public static void main(String[] args) {
        SpringApplication.run(HzcZipkinDbApplication.class, args);
    }
}
