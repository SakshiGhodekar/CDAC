package com.demo.dao;

import java.util.HashMap;
import java.util.List;

import com.demo.entity.Product;

public interface ProductDao {

	List<Product> findAll();

	Boolean removeById(int id);

	Product findById(int id);

	boolean save(Product p);

	boolean UpdateById(Product p);

	List<Product> findByCatagoty(int cid);

	void addProductInCart(String[] arr, HashMap<Integer, Product> map);

}
