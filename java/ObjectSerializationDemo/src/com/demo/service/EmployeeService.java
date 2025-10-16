package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void readFile(String string);

	boolean addNewEmployee();

	List<Employee> displayAll();

	boolean deletById(int id);

	Employee displayById(int eid);

	void writeToFile(String string);

	boolean modifyById(int id, double sal);

	

}
