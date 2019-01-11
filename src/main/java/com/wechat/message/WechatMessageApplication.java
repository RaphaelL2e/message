package com.wechat.message;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wechat.message.mapper")
public class WechatMessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(WechatMessageApplication.class, args);
	}

}

