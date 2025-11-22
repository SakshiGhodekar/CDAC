package com.demo.service;
import com.demo.dao.*;
import com.demo.beans.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class ProductServiceImpl implements ProductService {
  private ProductDao pdao;
  public ProductServiceImpl() {
	  pdao= new ProductDaoImpl();
  }
  
	@Override
	public boolean addNewProduct() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enetr pname");
		String pname=sc.next();
		System.out.println("Enter quantity");
		int qty=sc.nextInt();
		System.out.println("enter price");
		double price=sc.nextDouble();
		System.out.println("enter mfg date(dd/MM/YYYY)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Product p= new Product(pid,pname,qty,price,ldt);
		return pdao.save(p);
	}

	@Override
	public List<Product> displayAllProduct() {
		
		return pdao.displayAll();
	}

	@Override
	public boolean deleteById(int id) {
		
		return pdao.deleteById(id);
	}

	@Override
	public boolean modifyProduct(int id, int qty) {
		
		return pdao.modifyById(id,qty);
	}

	@Override
	public Product getById(int id) {
		
		return pdao.findById(id);
	}

	@Override
	public List<Product> sortById() {
		
		return pdao.sortByPrice();
	}

	

}
