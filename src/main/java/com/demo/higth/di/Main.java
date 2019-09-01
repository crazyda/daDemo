package com.demo.higth.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Diconfig.class);
		UserFunctionService userFunctionService = 
				context.getBean(UserFunctionService.class);
		System.out.println(userFunctionService.SayHello("di")); // Æô¶¯springBOot ÔÝÊ±×¢ÊÍ
		context.close();

	}

}
