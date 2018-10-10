package com.hzcf.hzc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author baiyun
 */
@EnableEurekaServer
@SpringBootApplication
public class HzcEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HzcEurekaApplication.class, args);
	}
}
