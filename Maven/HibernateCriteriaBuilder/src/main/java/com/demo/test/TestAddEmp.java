package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Employee;

public class TestAddEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee emp = new Employee( 1, "xxxx" , 122 , "hr" , 23);
		Employee emp1 = new Employee( 2, "bbbbb" , 12 , "media" , 24);
		Employee emp2= new Employee( 3, "aaaaa" , 50 , "manager" , 27);
		Employee emp3= new Employee( 4, "ddddd" , 135 , "media" , 29);
		Employee emp4= new Employee( 5, "ttt" , 90 , "maintainance" , 20);
		
		session.save(emp4);
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp);
		tr.commit();
		session.close();
		sf.close();
	}

}
