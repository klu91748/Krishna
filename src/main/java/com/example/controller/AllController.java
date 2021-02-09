package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.UserService;

@Controller
@RequestMapping("/")
public class AllController {

	@Autowired
	UserService userService;

	@GetMapping({"/","/home"})
	public String getHomePage() {
		//userOrderService.test();
		return "home";
	}
	
	@GetMapping("/403")
	public String get403() {
		return "403";		
	}
	
//	@GetMapping("error")
//	public String getError() {
//		return "error";
//	}
}
