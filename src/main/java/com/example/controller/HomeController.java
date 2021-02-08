package com.example.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Message;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class HomeController {

	@GetMapping("/hello")
	public Message firstPage() {
		//throw new RuntimeException("oh no!!!!!!!!!!!");
		return new Message("hi");
	}
	
	@GetMapping("/basicauth")
	public Message auth() {
		//throw new RuntimeException("oh no!!!!!!!!!!!");
		
		return new Message("hi");
	}

}