package com.demo.service;

import com.demo.beans.Project;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.dao.ProjectDao;
import com.demo.dao.ProjectDaoImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao edao;
	private ProjectDao pdao;
	public EmployeeServiceImpl() {
		edao= new EmployeeDaoImpl();
		pdao=new ProjectDaoImpl();
	}
	@Override
	public boolean addNewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id");
		int eid=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
	
		System.out.println("enter hiredate (dd/mm/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("enter salary");
		double sal=sc.nextDouble();
		System.out.println("enter project id");
		String pid=sc.next();
		String[] parr=pid.split(",");
		Set<Project> pset= pdao.findById(parr);
		return false;
	}
	

}
