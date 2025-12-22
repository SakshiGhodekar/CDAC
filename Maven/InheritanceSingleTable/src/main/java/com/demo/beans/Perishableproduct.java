package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value = "Perishable")
public class Perishableproduct extends Product {
	private LocalDate expdate;

	public Perishableproduct() {
		super();
	}

	public Perishableproduct(int pid, String pname, int qty, double pricae, LocalDate mfgDate,LocalDate expdate) {
		super(pid,pname,qty,pricae,mfgDate);
		this.expdate = expdate;
	}

	public LocalDate getExpdate() {
		return expdate;
	}

	public void setExpdate(LocalDate expdate) {
		this.expdate = expdate;
	}

	@Override
	public String toString() {
		return "Perishableproduct [expdate=" + expdate + "]";
	}
	
}
