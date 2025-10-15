package com.demo.beans;

import java.util.Objects;

public class Custemer {
 private int cid;
 private String cname;
 private String mob;
 
 
public Custemer(int cid, String cname, String mob) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.mob = mob;
}


@Override
public int hashCode() {
	return cid;
}


@Override
public boolean equals(Object obj) {
	return this.cid==((Custemer)obj).cid;
}


/**
 * @param cid
 */
public Custemer(int cid) {
	super();
	this.cid = cid;
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

public String getMob() {
	return mob;
}

public void setMob(String mob) {
	this.mob = mob;
}

@Override
public String toString() {
	return "Custemer [cid=" + cid + ", cname=" + cname + ", mob=" + mob + "]";
}
 
 
}
