package com.demo.higth.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.demo.higth.aop")
@EnableAspectJAutoProxy // ���� Spring ��AspectJ ��֧��
public class AopConfig {

}
