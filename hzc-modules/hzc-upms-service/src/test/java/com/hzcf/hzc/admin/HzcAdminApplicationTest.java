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

package com.hzcf.hzc.admin;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HzcAdminApplication.class)
public class HzcAdminApplicationTest {
	@Autowired
	private StringEncryptor stringEncryptor;

	@Test
	public void testEnvironmentProperties() {
//		System.out.println(stringEncryptor.encrypt("redis"));
//		System.out.println(stringEncryptor.encrypt("hzc"));
		System.out.println(stringEncryptor.encrypt("baiyun"));
		System.out.println(stringEncryptor.encrypt("root"));
//		System.out.println(stringEncryptor.encrypt("g0HJr2Ltrs0k6tJDY6pDI2aVMUCPSWZDTROLcFMs"));
//		System.out.println(stringEncryptor.encrypt("24760324"));
//		System.out.println(stringEncryptor.encrypt("175d516debb916d3842d981dd3b76061"));
//		System.out.println(stringEncryptor.encrypt("101322838"));
//		System.out.println(stringEncryptor.encrypt("fe6ec1ed3fc45e664ce8ddbf78376ab7"));
	}

}
