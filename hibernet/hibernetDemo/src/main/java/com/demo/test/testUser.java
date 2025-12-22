package com.demo.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.User;

public class testUser {
	
	public static void main(String[] args) {
		SessionFactory sf = new  Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		User user = new User(1 , "samarth" , "4484534");
		
		session.save(user);
		tr.commit();
		session.close();
		sf.close();
	}
}
