package com.woniuxy.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@ResponseBody
	@RequestMapping("/myfirst.do")
	public String myFirst() {
		return "myspring------------";
	}
	
	@RequestMapping("/mysecond.do")
	public String test01() {
		System.out.println("second");
		
		return "forword:/web2/a.html";
		
	}
}
