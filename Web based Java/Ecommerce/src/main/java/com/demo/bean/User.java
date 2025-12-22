package com.demo.bean;

public class User {
    private String uname;
    private String pass;
    private String email;
    private String role;
	public User() {
		super();
	}
	
	public User(String uname, String pass, String email, String role) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.email = email;
		this.role = role;
	}

	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "User [uname=" + uname + ", email=" + email + ", role=" + role + "]";
	}
    
}
