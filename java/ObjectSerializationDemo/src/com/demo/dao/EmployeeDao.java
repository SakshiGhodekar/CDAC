package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void findFile(String fname);

	boolean save(Employee e);

	List<Employee> display();

	boolean removeById(int id);

	Employee searchById(int eid);

	void WriteToFile(String fname);

	

	boolean changeById(int id,double sal);

}
