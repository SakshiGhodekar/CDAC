package com.demo.beans;

public class Employee {

	private int eid;
	private String ename;
	private String Desg;
	private double sal;

	public Employee(int eid, String ename, String desg, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		Desg = desg;
		this.sal = sal;
	}

	public Employee() {
		
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDesg() {
		return Desg;
	}

	public void setDesg(String desg) {
		Desg = desg;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", Desg=" + Desg + ", sal=" + sal + "]";
	}
	
	
}
