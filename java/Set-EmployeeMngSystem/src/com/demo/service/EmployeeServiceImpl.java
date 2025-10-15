package com.demo.service;
import com.demo.dao.EmplyeeDao;
import com.demo.dao.EmployeeDaoImpl;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import com.demo.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService {
    
	private EmplyeeDao edao;

    public EmployeeServiceImpl() {
    	super();

    	this.edao= new EmployeeDaoImpl();
    }
    
	@Override
	public boolean addNewEmploye() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("Enter Salary");
		
		double sal=sc.nextDouble();
		System.out.println("Enter joining Date(dd/mm/yyyy)");
		String dt=sc.next();
		
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));		
	    Employee e=new Employee(id,nm,sal,ldt);

		return edao.save(e);
	}

	@Override
	public Set<Employee> displayAll() {
		
		return edao.display();
	}

	@Override
	public Employee findById(int id) {
		
		return edao.searchById(id);
	}

	@Override
	public Set<Employee> SearchByName(String nm) {
		
		return edao.findByName(nm);
	}

	@Override
	public boolean updateBySal(int id, double sal) {
		
		return edao.updateBySal(id,sal);
		
	}

	@Override
	public boolean deleteById(int id) {
		return edao.removeById(id);
	}

	@Override
	public boolean deleteBySal(double sal) {
		return edao.removeBySal(sal);
	}

	@Override
	public Set<Employee> sortById() {
		return edao.sortById();
	}

	@Override
	public List<Employee> sortByName() {
		return edao.sortByName();
	}

	@Override
	public List<Employee> sortBySal() {
		return edao.sortBySal();
	}

}
