package com.demo.beans;

public class User {
	private int uid;
	private String name;
	private String address;
	public User() {
		super();
	}
	public User(int uid, String name, String address) {
		super();
		this.uid = uid;
		this.name = name;
		this.address = address;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
