package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping(value = "view")
	public String Getdata() {
		return "I'm sending a raven  \r\n   " + "With blood on its wings   \r\n" + "Hoping it reaches you in time     \r\n"
				+ "And you know what it means     \r\n" + "'Cause out here in the darkness    \r\n" + "And out of the light     \r\n"
				+ "If you get to me too late       \r\n" + "Just know that I tried";

	}
}
