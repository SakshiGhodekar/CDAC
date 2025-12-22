package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("p1")
public class Product {
	@Value("${p.pid}")
	private int pid;
	@Value("${p.pname}")
	private String pname;
	@Value("${p.qty}")
	private int qty;
	@Value("${p.price}")
	private double price;
	@Autowired
	private Category ctg;
	public Product() {
		super();
	}
	public Product(int pid, String pname, int qty, double price, Category ctg) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.ctg = ctg;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Category getCtg() {
		return ctg;
	}
	public void setCtg(Category ctg) {
		this.ctg = ctg;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", ctg=" + ctg + "]";
	}
	
	
	
}
