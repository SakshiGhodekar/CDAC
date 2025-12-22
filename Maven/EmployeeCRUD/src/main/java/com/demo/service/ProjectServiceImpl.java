package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import com.demo.dao.ProjectDao;
import com.demo.dao.ProjectDaoImpl;

import com.demo.beans.*;
public class ProjectServiceImpl implements ProjectService {
	private ProjectDao pdao;
	public ProjectServiceImpl() {
		pdao=new ProjectDaoImpl();
	}
	@Override
	public boolean addNewProject() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pid");
		int pid=sc.nextInt();
		
		System.out.println("Enter pname");
		String pname=sc.next();
		
		System.out.println("start date (dd/mm/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Project p=new Project(pid,pname,ldt);
		
		return pdao.save(p);
	}
}
