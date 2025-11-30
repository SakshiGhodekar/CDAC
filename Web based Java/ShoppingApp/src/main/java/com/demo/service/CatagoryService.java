package com.demo.service;

import java.util.List;

import com.demo.entity.Catagory;

public interface CatagoryService {

	List<Catagory> getAllCatagories();

	boolean addCategory(Catagory c);

}
