package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	

	boolean addNewEmploye();

	Set<Employee> displayAll();

	Employee findById(int id);

	Set<Employee> SearchByName(String nm);

	boolean updateBySal(int id, double sal);

	boolean deleteById(int id);

	boolean deleteBySal(double sal);

	Set<Employee> sortById();

	List<Employee> sortByName();

	List<Employee> sortBySal();

}
