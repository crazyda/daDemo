package com.demo.higth.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFunctionService {
	
	@Autowired
	FunctionService functionService;
	
	public String SayHello(String word) {
		return functionService.sayHello(word);
	}
}
