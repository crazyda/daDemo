package com.demo.higth.ch02.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


//事件发布类
@Component
public class DemoPublisher {
	
	@Autowired
	ApplicationContext applicationContext; // 这个用来发布事件
	
	public void publish(String msg) {
		applicationContext.publishEvent(new DemoEvent(this,msg)); // publistEven 方法用来发布
	}
}
