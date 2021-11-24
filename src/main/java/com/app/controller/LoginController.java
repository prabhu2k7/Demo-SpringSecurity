package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController
{

	@GetMapping("/login")
	public String loginPage()
	{
		
		
		return "welcome to the page!!";
	}

}
