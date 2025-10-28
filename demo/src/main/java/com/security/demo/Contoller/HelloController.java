package com.security.demo.Contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

	@GetMapping("/")
	public String gethello(HttpServletRequest request) {
		return "hello this is vamsi"  +request.getSession().getId(); //sessionid 
	}
	//username and password
	

}
