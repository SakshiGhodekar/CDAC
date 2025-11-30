package com.demo.service;

import java.util.List;

import com.demo.dao.CatagoryDao;
import com.demo.dao.CatagoryDaoImpl;
import com.demo.entity.Catagory;

public class CatagoryServiceImpl implements CatagoryService{
	private CatagoryDao dao;
	
	public CatagoryServiceImpl() {
		dao=new CatagoryDaoImpl();
	}

	@Override
	public List<Catagory> getAllCatagories() {
		return dao.findAll();
	}

	@Override
	public boolean addCategory(Catagory c) {
		return dao.save(c);
	}
}
