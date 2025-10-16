package com.demo.service;
import java.util.*;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.beans.*;
public class EmployeeServiceImpl implements EmployeeService {
  private EmployeeDao edao;
  
  public EmployeeServiceImpl() {
	  super();
	  this.edao=new EmployeeDaoImpl();
  }
	@Override
	public void readFile(String fname) {
		
		edao.findFile(fname);
	}
	@Override
	public boolean addNewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter emp id");
		int id=sc.nextInt();
		System.out.println("enter emp name");
		String name=sc.next();
		System.out.println("enter desginaton");
		String desg=sc.next();
		System.out.println("enter salary");
		double sal=sc.nextDouble();
		Employee e=new Employee(id,name,desg,sal);
		
		return edao.save(e);
	}
	@Override
	public List<Employee> displayAll() {
		
		return edao.display();
	}
	@Override
	public boolean deletById(int id) {
		
		return edao.removeById(id);
	}
	@Override
	public Employee displayById(int eid) {

		return edao.searchById(eid);
	}
	@Override
	public void writeToFile(String fname) {
		 edao.WriteToFile(fname);
		
	}
	@Override
	public boolean modifyById(int id,double sal) {
		// TODO Auto-generated method stub
		return edao.changeById(id,sal);
	}



}
