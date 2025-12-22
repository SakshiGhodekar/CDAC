package com.example.SpringBootRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootRest.beans.Product;
import com.example.SpringBootRest.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService pservice;
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable int id) {
		Product p=pservice.getProduct(id);
		return ResponseEntity.ok(p);
	}
	
	@PostMapping("/")
	public ResponseEntity<Boolean> addProduct(@RequestBody Product p) {
		boolean status = pservice.insetProduct(p);
		return ResponseEntity.ok(status);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Boolean> upadteProduct(@PathVariable int id,@RequestBody Product p){
		boolean status = pservice.updateProduct(id , p);
		return ResponseEntity.ok(status);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> pList = pservice.getAllProducts();
		return ResponseEntity.ok(pList);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteProduct(@PathVariable int id){
		boolean  status = pservice.deleteProductBId(id);
		return ResponseEntity.ok(status);
	}
	
	@GetMapping("/sorted")
	public ResponseEntity<List<Product>> getProductListSorted(){
		List<Product> pList=pservice.getProductSortedByPrice();
		return ResponseEntity.ok(pList);
	}

}
