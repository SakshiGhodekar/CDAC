package com.demo.beans;

import java.time.LocalDate;

public class Product {
private int pid;
private int pname;
private int qty;
private double price;
private LocalDate expdate;
public Product() {
	super();
}
public Product(int pid, int pname, int qty, double price, LocalDate expdate) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.qty = qty;
	this.price = price;
	this.expdate = expdate;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", expdate=" + expdate
			+ "]";
}

}
