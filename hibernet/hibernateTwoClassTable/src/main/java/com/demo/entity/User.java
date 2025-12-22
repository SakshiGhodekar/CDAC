package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user1")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@Column( name="uname" , nullable = false , unique = true)
	private String name;
	private String mobNo;
	@Embedded
	Address add;
	public User() {
		super();
	}
	public User(String name, String mobNo, Address add) {
		super();
		this.name = name;
		this.mobNo = mobNo;
		this.add = add;
	}
	public User(int id, String name, String mobNo, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.mobNo = mobNo;
		this.add = add;
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
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobNo=" + mobNo + ", add=" + add + "]";
	}
	
	
}
