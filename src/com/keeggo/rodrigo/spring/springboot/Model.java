package com.keeggo.rodrigo.spring.springboot;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Model {
	
	
	
	public List<String> getResult(){
		
		return new DAO().select();
		
		
	}
}
