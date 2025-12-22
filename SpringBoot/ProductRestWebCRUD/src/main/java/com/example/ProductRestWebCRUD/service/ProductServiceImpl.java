package com.example.ProductRestWebCRUD.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProductRestWebCRUD.dto.ProductDto;
import com.example.ProductRestWebCRUD.mapper.ProductDtoMapper;
import com.example.SpringBootMvcCrud.beans.Product;
import com.example.SpringBootMvcCrud.dao.ProductDao;



@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao pdao;

	@Override
	public List<ProductDto> getAllProducts(int cid) {
		List<Product> plist=pdao.findAllByCid(cid);
		List<ProductDto> plist1=plist.stream()
				.map(prod->ProductDtoMapper.mapToProductDto(prod))
				.collect(Collectors.toList());
		return plist1;
	}

}
