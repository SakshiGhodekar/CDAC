package com.demo.service;
import java.util.*;
import com.demo.dao.CourseDao;
import com.demo.dao.CourseDaoImpl;

public class CourseServiceImpl implements CourseService {
  private CourseDao cdao;
  
public CourseServiceImpl() {
	super();
	this.cdao=new CourseDaoImpl();
};
  
	@Override
	public boolean addNewCourse() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter course name");
		String cname=sc.next();
		System.out.println("enter capacity");
		int capacity=sc.nextInt();
		
		return cdao.save(cname,capacity);
	}

}
