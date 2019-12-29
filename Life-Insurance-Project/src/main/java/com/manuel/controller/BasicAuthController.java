package com.manuel.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manuel.model.Authentication;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class BasicAuthController {
	
	@GetMapping(path = "/basicauth")
    public Authentication basicauth() {
        return new Authentication("You are authenticated");
    }
	

}
