package com.demo.beans;

import java.time.LocalDate;
import java.util.Set;


import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Project {
	@Id

	private int pid;
	private String pname;
	private LocalDate startDate;
	@ManyToMany(mappedBy = "projects")
	Set<Employee> employees;
	public Project() {
		super();
	}
	public Project(int pid, String pname, LocalDate startDate, Set<Employee> employees) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.startDate = startDate;
		this.employees = employees;
	}
	public Project(int pid, String pname, LocalDate startDate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.startDate = startDate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", startDate=" + startDate + ", employees=" + employees
				+ "]";
	}
	

}
