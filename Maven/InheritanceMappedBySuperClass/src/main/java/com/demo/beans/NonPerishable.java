package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
@Entity
public class NonPerishable extends Product {
	private int garentee;

	public NonPerishable() {
		super();
	}

	public NonPerishable(int pid, String pname, int qty, double pricae, LocalDate mfgDate,int garentee) {
		super(pid, pname, qty, pricae,mfgDate);
		this.garentee = garentee;
	}

	@Override
	public String toString() {
		return "NonPerishable [garentee=" + garentee + "]";
	}

  
	
}
