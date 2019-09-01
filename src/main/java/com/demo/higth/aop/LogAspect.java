package com.demo.higth.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect // ����һ������
@Component //�ô������ΪSpring ���������Bean
public class LogAspect {

	@Pointcut("@annotation(com.demo.higth.aop.Action)") //ע�������е�
	public void annotationPointCut() {}
		
		@After("annotationPointCut()") //ע������һ������ , ��ʹ��@PointCut ������е�
		public void after (JoinPoint joinPoint) {
			MethodSignature signature = (MethodSignature) joinPoint.getSignature();
			Method method = signature.getMethod();
			Action action = method.getAnnotation(Action.class);
			System.out.println("��������ʽ����,"+action.name());// ͨ������ ���ע���ϵ�����, Ȼ������־��¼��ز���
		}
		
		@Before("execution(* com.demo.higth.aop.DemoMethodService.*(..))") //ע�� ����һ������, �˽���ֱ��ʹ�����ع�����Ϊ����
		public void before(JoinPoint joinPoint ) {
			MethodSignature signature = (MethodSignature) joinPoint.getSignature();
			Method method = signature.getMethod();
			System.out.println("��������ʽ����,"+method.getName());
		}
		
		
	
}
