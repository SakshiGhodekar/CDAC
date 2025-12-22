package com.demo.test;

import java.util.List;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Employee;

public class TestGetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Employee> query = cb.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
//         query.select(root).where(cb.or(
//        		 cb.equal(root.get("sal"),122 ) , 
//        		 cb.equal(root.get("dept"), "hr")
//        		 ));
		
		Predicate p1=cb.equal(root.get("dept"),"hr");
				
//         List<Employee> elist = session.createQuery("from Employee e where e.sal>100 and dept='hr'").getResultList();
         
//         System.out.println(elist);
		query.select(root).where(p1);
		 List<Employee> elist =session.createQuery(query).getResultList();
		 System.out.println(elist);
		tr.commit();
		session.close();
		sf.close();
	}

}
