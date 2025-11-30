package com.demo.service;

import java.util.HashMap;
import java.util.List;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.entity.Product;

public class ProductServiceImpl implements ProductService{
	
	private ProductDao dao;
	
	public ProductServiceImpl() {
		dao=new ProductDaoImpl();
	}

	@Override
	public List<Product> getAllProducts() {
		return dao.findAll();
	}

	@Override
	public Boolean deleteProductById(int id) {
		return dao.removeById(id);
	}

	@Override
	public Product getProductById(int id) {
		return dao.findById(id);
	}

	@Override
	public boolean updateProduct(Product p) {
		return dao.UpdateById(p);
	}

	@Override
	public List<Product> getByCatagory(int cid) {
		return dao.findByCatagoty(cid);
	}

	@Override
	public void addProductInCart(String[] arr, HashMap<Integer, Product> map) {
		dao.addProductInCart(arr , map);
		
	}

	@Override
	public boolean addProduct(Product p) {
		return dao.save(p);
	}

}
