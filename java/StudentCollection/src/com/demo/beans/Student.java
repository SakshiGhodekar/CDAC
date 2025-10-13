package com.demo.beans;

import java.util.Objects;

public class Student {
	
	private int id;
	private String name;
	private int marks1;
	private int marks2;
	private double avg;
	
	public Student(int id2) {
		this.id=id2;
	}
	public Student(int id, String name, int marks1, int marks2) {
		super();
		this.id = id;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
	
	}
	
	public Student(double avg) {
		super();
		this.avg = avg;
	}
	public Student(String name2) {
		this.name=name2;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals method "+this.id+"----"+((Student)obj).id);
		return this.id==((Student)obj).id;
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

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks1=" + marks1 + ", marks2=" + marks2 + ", avg=" + avg
				+ "]";
	}

	
	
	
 
}
