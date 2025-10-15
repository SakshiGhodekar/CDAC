package com.demo.beans;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee>{
 private int id;
 private String name;
 private double Salary;
 private LocalDate jdt;
 
public Employee(int id, String name, double salary, LocalDate jdt) {
	super();
	this.id = id;
	this.name = name;
	Salary = salary;
	this.jdt = jdt;
}

public Employee(int id) {
	super();
	this.id = id;
}

@Override
public int hashCode() {
	System.out.println("In hashcode method "+id);
	return id;
}
@Override
public boolean equals(Object obj) {
	System.out.println("In Equals method"+this.id+"----"+((Employee)obj).id);
	return this.id==((Employee)obj).id;
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

public double getSalary() {
	return Salary;
}

public void setSalary(double salary) {
	Salary = salary;
}

public LocalDate getJdt() {
	return jdt;
}

public void setJdt(LocalDate jdt) {
	this.jdt = jdt;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", jdt=" + jdt + "]";
}

@Override
public int compareTo(Employee o) {
	System.out.println("in compareTo method "+this.id+"-----"+o.id);

	return this.id-o.id; 
}
 
 
 
}