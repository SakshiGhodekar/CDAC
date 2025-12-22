package com.demo.beans;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name="myproduct")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Product {
	@Id
	private int pid;
	private String pname;
	private int qty;
	private double pricae;
	private LocalDate mfgDate;
	public Product() {
		super();
	}
	public Product(int pid, String pname, int qty, double pricae, LocalDate mfgDate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.pricae = pricae;
		this.mfgDate = mfgDate;
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
	public double getPricae() {
		return pricae;
	}
	public void setPricae(double pricae) {
		this.pricae = pricae;
	}
	public LocalDate getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", pricae=" + pricae + ", mfgDate="
				+ mfgDate + "]";
	}
	
	

}
