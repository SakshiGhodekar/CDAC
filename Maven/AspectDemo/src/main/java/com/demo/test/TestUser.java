package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.aop.MyAspect;
import com.demo.beans.User;

public class TestUser {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		User u = context.getBean(User.class);
		u.m1();
		
		System.out.println();
		
	}
}
