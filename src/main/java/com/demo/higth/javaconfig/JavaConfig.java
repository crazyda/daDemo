package com.demo.higth.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // ������ǰ����һ��������,�����ж��@Bean ע�� û��ʹ�ð�ɨ��, ����Ϊ���е�Bean ���ڴ����ж�����
public class JavaConfig {
	@Bean //2
	public FunctionService functionService(){
		return new FunctionService();
	}
	
	@Bean 
	public UseFunctionService useFunctionService(){
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService()); //3 ע��FunctionService ��ʱ��ֱ�ӵ���functionService()
		return useFunctionService;
		
	}

//	@Bean 
//	public UseFunctionService useFunctionService(FunctionService functionService){//4
//		UseFunctionService useFunctionService = new UseFunctionService();
//		useFunctionService.setFunctionService(functionService);
//		return useFunctionService;
//	}
}
