package com.demo.test;
import com.demo.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	public static void main(String[]args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
		Product p=(Product)ctx.getBean("p1");
		System.out.println(p);
	}

}
