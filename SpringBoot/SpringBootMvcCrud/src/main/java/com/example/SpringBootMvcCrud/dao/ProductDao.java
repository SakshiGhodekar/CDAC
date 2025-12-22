package com.example.SpringBootMvcCrud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootMvcCrud.beans.Product;



@Repository
public interface ProductDao extends JpaRepository<Product,Integer>{

	List<Product> findAllByCid(int cid);

}
