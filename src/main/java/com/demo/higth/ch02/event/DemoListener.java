package com.demo.higth.ch02.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//事件监听
@Component
public class DemoListener implements ApplicationListener<DemoEvent> { //接口指定监听的事件类型 


	public void onApplicationEvent(DemoEvent event) { //使用这个方法对消息进行接受处理
		String msg = event.getMsg();
		System.out.println("我(bean-domoListener)接受到bean-demoPublisher发布的消息:"+msg);
		
	}

}
