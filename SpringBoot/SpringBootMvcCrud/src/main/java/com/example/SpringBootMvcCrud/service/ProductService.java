package com.example.SpringBootMvcCrud.service;

import java.util.List;

import com.example.SpringBootMvcCrud.beans.Product;



public interface ProductService {

	List<Product> findAllProducts();

	void addnewProduct(Product product);

	Product getById(int pid);

	void updateProduct(Product prod);

	void deleteProduct(int pid);

}
