package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "NonPerishable")
public class NonPershable extends Product{
	private int garentee;

	public NonPershable() {
		super();
	}

	public NonPershable(int pid, String pname, int qty, double pricae, LocalDate mfgDate,int garentee) {
		super(pid,pname,qty,pricae,mfgDate);
		this.garentee = garentee;
	}

	public int getGarentee() {
		return garentee;
	}

	public void setGarentee(int garentee) {
		this.garentee = garentee;
	}

	@Override
	public String toString() {
		return "NonPershable [garentee=" + garentee + "]";
	}
	

}
