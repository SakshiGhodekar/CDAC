package com.demo.service;

import java.util.List;

import com.demo.bean.Product;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
	ProductDao dao;
	public ProductServiceImpl() {
		dao=new ProductDaoImpl();
	}
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAllProduct();
	}

}
