package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.*;
public class TestGetData {
	public static void main(String[]args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Cart c=session.get(Cart.class, 1);
		Cart c1=session.get(Cart.class, 2);
		Items i1=session.get(Items.class,1);
		System.out.println(i1.getCart());
		System.out.println(c1.getItems());
		tr.commit();
		session.close();
		sf.close();
	}

}
