package com.demo.dao;

import java.util.List;

import com.demo.entity.Catagory;

public interface CatagoryDao {

	List<Catagory> findAll();

	boolean save(Catagory c);

}
