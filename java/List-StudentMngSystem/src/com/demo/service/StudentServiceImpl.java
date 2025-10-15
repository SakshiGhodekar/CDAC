package com.demo.service;
import java.util.*;
import com.demo.dao.*;
import com.demo.beans.*;
public class StudentServiceImpl implements StudentService {
 private StudentDao edao;
 
 public StudentServiceImpl() {
	 edao=new StudentDaoImpl();
 }
	@Override
	public boolean addNewStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("marks1");
		int marks1=sc.nextInt();
		System.out.println("enter marks2");
		int marks2=sc.nextInt();
		Student s=new Student(id,name,marks1,marks2);
		return edao.save(s);
		
	}
	@Override
	public List<Student> displayAll() {
		
		return edao.displayAll();
	}
	@Override
	public Student FindById(int id) {
	
		return edao.SearchById(id);
	}
	@Override
	public List<Student> FindByName(String name) {
		return edao.SearchByName(name);
	}
	@Override
	public boolean updateByMarks(int id,int marks1) {
		
		return edao.updateMarks(id,marks1);
	}
	@Override
	public boolean updateByMarks2(int id, int marks2) {
		return edao.updateMarks1(id,marks2);
		
	}
	@Override
	public boolean deleteById(int id) {
		
		return edao.deleteId(id);
	}
	@Override
	public boolean deleteByAvg(double avg) {
		
		return edao.deleteAvg(avg);
	}
	@Override
	public List<Student> sortById() {
		return edao.sortId();
	}

}
