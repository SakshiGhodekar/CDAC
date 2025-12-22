package com.demo.bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Perishable")
public class PerishableProduct extends Product {
	private String expDate;

	public PerishableProduct(int id, String name, double price , String expDate) {
		super(id , name , price);
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return super.toString()+" PerishableProduct [expDate=" + expDate + "]";
	}
	
	
}
