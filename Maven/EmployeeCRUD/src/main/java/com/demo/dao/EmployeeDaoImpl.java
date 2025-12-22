package com.demo.dao;

import org.hibernate.SessionFactory;

public class EmployeeDaoImpl implements EmployeeDao{
	
	public static SessionFactory sf;
	static {
		sf=HibernateUtil.getMySessionFactory();
	}
	

}
