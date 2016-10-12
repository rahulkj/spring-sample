package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Greeting;

@RestController("/hello")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public Greeting greeting() {
		return new Greeting("Hey there!");
	}
}
