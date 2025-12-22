package com.demo.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

public class TestRB {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
		MessageSource ms = context.getBean(ResourceBundleMessageSource.class);
		
		Locale local=null;
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1->{
			local = new Locale("marathi" , "In");
			System.out.println(local.getLanguage()+"   "+local.getCountry());
		}
		case 2->{
			local = Locale.UK;
			System.out.println(local.getLanguage()+"   "+local.getCountry());
		}
		case 3->{
			local = Locale.US;
			System.out.println(local.getLanguage()+"   "+local.getCountry());
		}
		}
		
		String msg1=ms.getMessage("msg.pay", null, local);
		String msg2=ms.getMessage("msg.welcome", new Object[] {"samarth"}, local);
		String msg3=ms.getMessage("msg.billmsg", null, local);
		String msg4=ms.getMessage("msg.currency", null, local);
		
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg3);
		System.out.println(msg4);
	}
}
