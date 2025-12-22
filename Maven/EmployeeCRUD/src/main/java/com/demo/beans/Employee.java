package com.demo.beans;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int eid;
	private String ename;
	private LocalDate hiredate;
	private double salary;
	@ManyToMany
	private Set<Project> projects;
	
	public Employee() {
		super();
	}

	public Employee(int eid, String ename, LocalDate hiredate, double salary, Set<Project> projects) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.hiredate = hiredate;
		this.salary = salary;
		this.projects = projects;
	}

	public Employee(int eid, String ename, LocalDate hiredate, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.hiredate = hiredate;
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", hiredate=" + hiredate + ", salary=" + salary
				+ "]";
	}
	
	

}
