package com.demo.entity;

public class Product {
	private int id;
	private String name ;
	private double price ;
	private int qty;
	private int categortId;
	
	public Product() {
		super();
	}

	public Product(String name, double price, int qty, int categortId) {
		super();
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.categortId = categortId;
	}

	public Product(int id, String name, double price, int qty, int categortId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.categortId = categortId;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getCategortId() {
		return categortId;
	}

	public void setCategortId(int categortId) {
		this.categortId = categortId;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + ", categortId="
				+ categortId + "]";
	}
	
}
