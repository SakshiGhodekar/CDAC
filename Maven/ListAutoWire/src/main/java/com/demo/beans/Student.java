package com.demo.beans;

import java.util.Set;

public class Student {
	private int id;
	private String name;
	private Set<Subject> allSubjects;
	public Student() {
		super();
	}
	public Student(int id, String name, Set<Subject> allSubjects) {
		super();
		this.id = id;
		this.name = name;
		this.allSubjects = allSubjects;
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
	public Set<Subject> getAllSubjects() {
		return allSubjects;
	}
	public void setAllSubjects(Set<Subject> allSubjects) {
		this.allSubjects = allSubjects;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", AllSubjects=" + allSubjects + "]";
	}
	
}
