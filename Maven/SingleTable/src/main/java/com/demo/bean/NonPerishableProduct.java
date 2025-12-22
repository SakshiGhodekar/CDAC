package com.demo.bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Non-Perishable")
public class NonPerishableProduct extends Product {
	private int guarantee;

	public NonPerishableProduct() {
		super();
	}

	public NonPerishableProduct(int id, String name, double price , int i) {
		super(id , name , price);
		this.guarantee = i;
	}

	@Override
	public String toString() {
		return super.toString()+" NonPerishableProduct [guarantee=" + guarantee + "]";
	}
	
}
