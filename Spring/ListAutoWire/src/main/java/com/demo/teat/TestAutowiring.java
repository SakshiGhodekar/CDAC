package com.demo.teat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Student;

public class TestAutowiring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		Student s = context.getBean(Student.class);
		System.out.println(s);
		((ClassPathXmlApplicationContext)context).close();
	}
}
