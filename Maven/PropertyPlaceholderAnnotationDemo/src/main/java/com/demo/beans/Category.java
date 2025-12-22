package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component

public class Category {
	@Value("${c.cid}")
	private int cid;
	@Value("${c.cname}")
	private String cname;
	@Value("${c.descr}")
	private String descr;
	public Category() {
		super();
	}
	public Category(int cid, String cname, String descr) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.descr = descr;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + ", descr=" + descr + "]";
	}
	
}
