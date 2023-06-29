package com.ncodeit.springsecurityjwt.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	@PreAuthorize("hasRole('ADMIN')")
	public String getAllProducts(){
		return "hello";
	}

}
