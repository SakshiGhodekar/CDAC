package com.demo.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.NonPerishable;
import com.demo.beans.PerishableProduct;
import com.demo.beans.Product;

public class TestMappedBuSuperClass {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session= sf.openSession();
		Transaction tr=session.beginTransaction();
		
		Product p=new PerishableProduct(1,"chair",12,12000,LocalDate.of(2025,12,12),LocalDate.of(2020,12,10));
		Product p1=new NonPerishable(2,"chair",12,12000,LocalDate.of(2025,12,12),12);
	   
		session.save(p);
		session.save(p1);
		
		tr.commit();
		session.close();
		sf.close();
		}

	}


