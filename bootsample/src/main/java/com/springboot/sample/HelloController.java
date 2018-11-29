package com.springboot.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//HelloWorld
	@RequestMapping(value="/")
		private String hello() {
			return "Hello world!!";
		}
	}
