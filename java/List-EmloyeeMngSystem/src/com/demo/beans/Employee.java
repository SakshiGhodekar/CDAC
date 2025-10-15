package com.demo.beans;

import java.time.LocalDate;

public class Employee {
 private int empid;
 private String ename;
 private double salary;
 private LocalDate jdt;
 
 public Employee(double sal) {
	 super();
 }
 
 public Employee(int id) {
	 this.empid=id;
 }
 
 public Employee(int empid,String ename,double salary,LocalDate jdt) {
	 
	 super();
	 this.empid=empid;
	 this.ename=ename;
	 this.salary=salary;
	 this.jdt=jdt;
 }

public int getEmpid() {
	return empid;
}
@Override
public boolean equals(Object obj) {
	System.out.println("in equals method "+this.empid+"----"+((Employee)obj).empid);
	return this.empid==((Employee)obj).empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public LocalDate getJdt() {
	return jdt;
}

public void setJdt(LocalDate jdt) {
	this.jdt = jdt;
}

@Override
public String toString() {
	return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", jdt=" + jdt + "]";
}
 
 
}
