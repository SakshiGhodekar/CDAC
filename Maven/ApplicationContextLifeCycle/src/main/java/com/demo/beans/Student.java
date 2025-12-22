package com.demo.beans;

import java.util.Iterator;
import java.util.List;

import javax.security.auth.Destroyable;
import javax.xml.namespace.NamespaceContext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student implements BeanNameAware , BeanFactoryAware , ApplicationContextAware , InitializingBean , DisposableBean{
	private int id;
	private String name;
	private List<Subject> subjects;
	public Student() {
		super();
	}
	public Student(int id, String name, List<Subject> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subjects;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subjects=" + subjects + "]";
	}
	public void setBeanName(String name) {
       System.out.println("In bean name aware");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("In after set properties method");
		
	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("In bean set application context method");
		
	}
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("In bean factory method");
		
	}
	
	public void customInit() {
		System.out.println("In custom init method");
	}
	public void destroy() throws Exception {
		System.out.println("In destroy method");
		
	}
	
	public void customDestroy() {
		System.out.println("In custom delete method");
	}
	
	
}
