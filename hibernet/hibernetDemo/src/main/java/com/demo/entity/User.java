package com.demo.entity;

public class User {
	private int id;
	private String name;
	private String mobNo;
	public User() {
		super();
	}
	public User(int id, String name, String mobNo) {
		super();
		this.id = id;
		this.name = name;
		this.mobNo = mobNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobNo=" + mobNo + "]";
	}
	
}
