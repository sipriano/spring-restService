package com.keeggo.rodrigo.spring.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/spring")
public class HelloController {
	
	@Autowired
	private Model model;
	
	@GetMapping
	public List<String> hello() {
		
		return model.getResult();
		
	}
	
}
