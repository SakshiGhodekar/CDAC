package com.example.SpringBootRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootRest.beans.Product;
import com.example.SpringBootRest.dao.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository pdao;

	@Override
	public Product getProduct(int id) {
		 Optional<Product> p = pdao.findById(id);
		 if(p.isPresent()) {
			 return p.get();
		 }
		 return null;
	}

	@Override
	public boolean insetProduct(Product p) {
		Product prod =pdao.save(p);
		if(prod!=null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateProduct(int id, Product p) {
		Product prod =getProduct(id);
		if(prod==null) {
			return false;
		}
		pdao.save(p);
		return true;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> pList = pdao.findAll();
		return pList;
	}

	@Override
	public boolean deleteProductBId(int id) {
		Product p =getProduct(id);
				
		if(p==null)
			return false;
		pdao.deleteById(id);
		return true;
	}

	@Override
	public List<Product> getProductSortedByPrice() {
		List<Product> pList = pdao.sortByPrice();
		return pList;
	}
	

}
