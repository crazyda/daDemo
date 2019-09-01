package com.demo.higth.ch03.aware;


import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware { //

	private String beanName;
	private ResourceLoader loader;
	
	public void setResourceLoader(ResourceLoader resourceLoader) {

		this.loader = resourceLoader;
	}

	public void setBeanName(String name) {
		this.beanName = name;
		
	}
	
	public void outputResult() {
		System.out.println("Bean的名称:"+beanName);
		Resource resource = 
				loader.getResource("classpath:com/demo/higth/ch03/aware/test.txt");
		try {
			System.out.println("ResourceLoader加载的文件内容"+IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
