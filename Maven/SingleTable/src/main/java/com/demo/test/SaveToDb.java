package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.NonPerishableProduct;
import com.demo.bean.PerishableProduct;
import com.demo.bean.Product;
import com.demo.beans.Perishableproduct;

public class SaveToDb {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Product per = new PerishableProduct( 1, "xxxxx" , 11.00  ,"hkjkk");
		Product nonPer = new NonPerishableProduct( 2, "yyyyy" , 77 , 2);
		
		session.save(nonPer);
		session.save(per);
		
		tr.commit();
		session.close();
		sf.close();
	}
}
