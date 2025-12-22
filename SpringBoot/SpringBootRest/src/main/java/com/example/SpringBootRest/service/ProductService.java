package com.example.SpringBootRest.service;

import java.util.List;

import com.example.SpringBootRest.beans.Product;

public interface ProductService {

	Product getProduct(int id);

	boolean insetProduct(Product p);

	boolean updateProduct(int id, Product p);

	List<Product> getAllProducts();

	boolean deleteProductBId(int id);

	List<Product> getProductSortedByPrice();

}
