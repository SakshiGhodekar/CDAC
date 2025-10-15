package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmplyeeDao {
 
	boolean save(Employee e);

	Set<Employee> display();

	Employee searchById(int id);

	Set<Employee> findByName(String nm);

	

	boolean updateBySal(int id, double sal);

	boolean removeById(int id);

	boolean removeBySal(double sal);

	Set<Employee> sortById();

	List<Employee> sortByName();

	List<Employee> sortBySal();

	

}
