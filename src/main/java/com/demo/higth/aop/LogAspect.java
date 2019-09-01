package com.demo.higth.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect // 声明一个切面
@Component //让此切面成为Spring 容器管理的Bean
public class LogAspect {

	@Pointcut("@annotation(com.demo.higth.aop.Action)") //注解声明切点
	public void annotationPointCut() {}
		
		@After("annotationPointCut()") //注解声明一个建言 , 并使用@PointCut 定义的切点
		public void after (JoinPoint joinPoint) {
			MethodSignature signature = (MethodSignature) joinPoint.getSignature();
			Method method = signature.getMethod();
			Action action = method.getAnnotation(Action.class);
			System.out.println("方法规则式拦截,"+action.name());// 通过反射 获得注解上的属性, 然后做日志记录相关操作
		}
		
		@Before("execution(* com.demo.higth.aop.DemoMethodService.*(..))") //注解 声明一个建言, 此建言直接使用拦截规则作为参数
		public void before(JoinPoint joinPoint ) {
			MethodSignature signature = (MethodSignature) joinPoint.getSignature();
			Method method = signature.getMethod();
			System.out.println("方法规则式拦截,"+method.getName());
		}
		
		
	
}
