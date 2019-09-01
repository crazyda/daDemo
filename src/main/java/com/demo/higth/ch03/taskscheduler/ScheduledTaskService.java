package com.demo.higth.ch03.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate= 5000)  //声明该方法是计划任务,
	public void reportCurrentTime() {
		System.out.println("每隔五秒执行一次:"+dateFormat.format(new Date()));
	}
	
	@Scheduled(cron="0 11 08 ? * *") // 按照指定时间执行  cron 是unix 和unix 系统下的定时任务
	public void fixTimeExecution() {
		System.out.println("指定时间执行:"+dateFormat.format(new Date())+"执行");
	}
	
	
}
