package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRestController {
	/**
	 * returning Hello From BridgeLabz Message
	 * @return
	 */
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello from BridgeLabz";
	}

}
