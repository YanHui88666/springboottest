package com.woniuxy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//默认不会读取其他配置文件，可以指定，不能用*通配
//@ImportResource("classpath:myspring_ss.xml")
@SpringBootApplication
public class Spingboot01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spingboot01Application.class, args);
	}

}
