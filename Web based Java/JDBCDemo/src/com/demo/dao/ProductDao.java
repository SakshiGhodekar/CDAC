package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean save(Product p);

	List<Product> displayAll();

	boolean deleteById(int id);

	boolean modifyById(int id, int qty);

	Product findById(int id);

	 

	List<Product> sortByPrice();

	Object closeMyConnection();

}
