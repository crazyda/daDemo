package com.demo.higth.ch02.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//�¼�����
@Component
public class DemoListener implements ApplicationListener<DemoEvent> { //�ӿ�ָ���������¼����� 


	public void onApplicationEvent(DemoEvent event) { //ʹ�������������Ϣ���н��ܴ���
		String msg = event.getMsg();
		System.out.println("��(bean-domoListener)���ܵ�bean-demoPublisher��������Ϣ:"+msg);
		
	}

}
