package com.example.ProductRestWebCRUD.service;

import java.util.List;

import com.example.ProductRestWebCRUD.dto.ProductDto;





public interface ProductService {

	List<ProductDto> getAllProducts(int cid);

}
