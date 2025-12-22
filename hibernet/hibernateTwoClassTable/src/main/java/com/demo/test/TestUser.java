package com.demo.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Address;
import com.demo.entity.User;


public class TestUser {
	
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Address a1 = new Address("pune" , 415118);
		User u1 = new User("sh" , "4455454" , a1);
		User u2 = new User("sam" , "4455454" , a1);
		
		session.save(u1);
		session.save(u2);
		tr.commit();
		
		session.close();
		sf.close();
	}
	
}
