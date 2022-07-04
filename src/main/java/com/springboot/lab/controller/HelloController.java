package com.springboot.lab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class HelloController {
//
//	@RequestMapping("/hello")
//	public String hello() {
//		return "hello";
//	}
//	
//}

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping("/world")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
}

