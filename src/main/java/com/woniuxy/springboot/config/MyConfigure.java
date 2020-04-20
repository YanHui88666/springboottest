package com.woniuxy.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.woniuxy.springboot.service.SomeService;

//表名这是一个配置类（好比是一个spring_service.xml）
@Configuration
public class MyConfigure {
	//默认名字就是方法名
	@Bean(name="sss")
	public SomeService someService() {
		
		
		return new SomeService();
		
	}
}
