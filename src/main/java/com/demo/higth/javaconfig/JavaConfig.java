package com.demo.higth.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 表明当前类是一个配置类,可能有多个@Bean 注解 没有使用包扫描, 是因为所有的Bean 都在此类中定义了
public class JavaConfig {
	@Bean //2
	public FunctionService functionService(){
		return new FunctionService();
	}
	
	@Bean 
	public UseFunctionService useFunctionService(){
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService()); //3 注入FunctionService 的时候直接调用functionService()
		return useFunctionService;
		
	}

//	@Bean 
//	public UseFunctionService useFunctionService(FunctionService functionService){//4
//		UseFunctionService useFunctionService = new UseFunctionService();
//		useFunctionService.setFunctionService(functionService);
//		return useFunctionService;
//	}
}
