package com.woniuxy.springboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.woniuxy.springboot.entity.Student;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class Spingboot01ApplicationTests {
	
	@Autowired
	ApplicationContext ac;
	@Autowired
	Student student;
	@Test
	void contextLoads() {
	}
	@Test
	public void test01() {
		System.out.println(ac.containsBean("sss"));
	}
	
	
	@Test
	public void test02() {
		Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.trace("trace");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("erroe");
	}
	
	@Test
	public void test03() {

		log.trace("trace");
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("erroe");
	}
}
