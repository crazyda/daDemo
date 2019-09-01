package com.demo.higth.ch02.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


//�¼�������
@Component
public class DemoPublisher {
	
	@Autowired
	ApplicationContext applicationContext; // ������������¼�
	
	public void publish(String msg) {
		applicationContext.publishEvent(new DemoEvent(this,msg)); // publistEven ������������
	}
}
