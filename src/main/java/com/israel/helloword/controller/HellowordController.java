package com.israel.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-word")
public class HellowordController {
	
	@GetMapping
	public String helloWord() {
		return "Hello Word";
	}
}
