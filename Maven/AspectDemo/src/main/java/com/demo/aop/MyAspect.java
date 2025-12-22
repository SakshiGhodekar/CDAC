package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	@Before("execution(* com.demo.beans.U*.*(..))")
	public void beforeeAspect() {
		System.out.println("In before config method");
	}
	
	@After("execution (* com.demo.beans.*.*(..))")
	public void AfterAspect() {
		System.out.println("In after aspect method");
	}
	
	@Around("execution (* com.demo.beans.*.*(..))")
	public Object AroundAspect(ProceedingJoinPoint joinpoint) throws Throwable {
		System.out.println("Around Aspect start");
		Object a=joinpoint.proceed();
		System.out.println("Around Aspect end");
		return a;
	}
}
