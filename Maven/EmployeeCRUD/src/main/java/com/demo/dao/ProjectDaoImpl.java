package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Project;

public class ProjectDaoImpl implements ProjectDao {
	public static SessionFactory sf;
	static {
		sf=HibernateUtil.getMySessionFactory();
	}
	@Override
	public boolean save(Project p) {
		try {
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			session.save(p);
			tr.commit();
			session.close();
			return true;
		}catch (Exception e) {
			// TODO: handle exception
		}
		return false;
		
		
	}
	@Override
	public Set<Project> findById(String[] parr) {
		List<Project> plist=new ArrayList<>();
		for(String p:parr) {
			
		}
		return null;
	}
	
}
