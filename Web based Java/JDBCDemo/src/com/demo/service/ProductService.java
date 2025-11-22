package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	List<Product> displayAllProduct();

	boolean deleteById(int id);

	boolean modifyProduct(int id, int qty);

	Product getById(int id);

	List<Product> sortById();

	

}
