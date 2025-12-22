package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class PerishableProduct extends Product {
	private LocalDate expdate;

	public PerishableProduct() {
		super();
	}

	public PerishableProduct(int pid, String pname, int qty, double pricae, LocalDate mfgDate,LocalDate expdate) {
		super(pid,pname,qty,pricae,mfgDate);
		this.expdate = expdate;
	}

	@Override
	public String toString() {
		return "PerishableProduct [expdate=" + expdate + "]";
	}
	
	
	
}
