package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.User;

public class TestPropertyPlaceholderDemo {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("SpringConfig.xml");
		User u=(User)ctx.getBean("s");
		System.out.println(u);
	}
}
