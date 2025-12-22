package com.demo.service;

import java.util.HashMap;
import java.util.List;

import com.demo.entity.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Boolean deleteProductById(int id);

	Product getProductById(int id);

	boolean updateProduct(Product p);

	List<Product> getByCatagory(int cid);

	void addProductInCart(String[] arr, HashMap<Integer, Product> map);

	boolean addProduct(Product p);

}
