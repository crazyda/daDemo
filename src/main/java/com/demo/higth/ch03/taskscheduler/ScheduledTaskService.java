package com.demo.higth.ch03.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate= 5000)  //�����÷����Ǽƻ�����,
	public void reportCurrentTime() {
		System.out.println("ÿ������ִ��һ��:"+dateFormat.format(new Date()));
	}
	
	@Scheduled(cron="0 11 08 ? * *") // ����ָ��ʱ��ִ��  cron ��unix ��unix ϵͳ�µĶ�ʱ����
	public void fixTimeExecution() {
		System.out.println("ָ��ʱ��ִ��:"+dateFormat.format(new Date())+"ִ��");
	}
	
	
}
