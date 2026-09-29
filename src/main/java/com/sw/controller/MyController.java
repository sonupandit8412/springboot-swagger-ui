package com.sw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	int a;

	@GetMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "Welcome to tomcat testing";
	}
	
	
	public void print() {
		int b = 0;
		
		System.out.println(a);
		System.out.println(b);
	}
}
