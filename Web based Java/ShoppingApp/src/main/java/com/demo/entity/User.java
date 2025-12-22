package com.demo.entity;

public class User {
	private int id;
	private String name;
	private String  role;
	private String email;
	
	public User() {
		super();
	}

	public User(String name, String role, String email) {
		super();
		this.name = name;
		this.role = role;
		this.email = email;
	}

	public User(int id, String name, String role, String email) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", role=" + role + ", email=" + email + "]";
	}
	
	
}
