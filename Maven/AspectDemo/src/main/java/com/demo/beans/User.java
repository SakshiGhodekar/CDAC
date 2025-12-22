package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Value("${user.name}")
	private String name;

	public User() {
		super();
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void m1() {
		 System.out.println("In m1 method");
	}
	
	public int m2(int a) {
		System.out.println("In m2 method");
		return a;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	
	
	
}
