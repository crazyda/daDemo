package com.demo.higth.ch03.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.demo.higth.ch03.taskscheduler")
@EnableScheduling //1 ע�⿪���Լƻ������֧��
public class TaskSchedulerConfig {

}
