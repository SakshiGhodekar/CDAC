package com.demo.dao;

import java.time.LocalDate;
import java.util.Set;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.ArrayList;


import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmplyeeDao {
 static Set <Employee> elist;
 static {
	 elist=new HashSet<>();
	 elist.add(new Employee(1,"sakshi",2342342,LocalDate.of( 4452,11, 11)));
	 elist.add(new Employee(2,"riya",44442,LocalDate.of(2002,02, 11)));
	 elist.add(new Employee(3,"diya",3332,LocalDate.of(2025,11, 11)));
	 elist.add(new Employee(4,"piya",50000,LocalDate.of(2023,07, 11)));
 }

 
	@Override
	public boolean save(Employee e) {
		
		return elist.add(e);
	}


	@Override
	public Set<Employee> display() {
		
		return elist;
	}


	@Override
	public Employee searchById(int id) {
		
		for(Employee e:elist) {
			if(e.getId()==id) {
				return e;
			}
	}
  return null;
}


	@Override
	public Set<Employee> findByName(String nm) {
		Set<Employee>eset=new HashSet<>();
		for(Employee e:elist) {
			if(e.getName().equals(nm)) {
				eset.add(e);
			}	
		}
		return eset;
		
	}


	public boolean updateBySal(int id, double sal) {
		// TODO Auto-generated method stub
		Employee e = searchById(id);
		if(e != null) {
			e.setSalary(sal);
			return true;
		}
		
		return false;
	}


	@Override
	public boolean removeById(int id) {
		return elist.remove(new Employee(id));
	}


	@Override
	public boolean removeBySal(double sal) {
		return elist.removeIf(e->e.getSalary()>sal);
	}


	@Override
	public Set<Employee> sortById() {
		Set<Employee> tset=new TreeSet<>();
		for(Employee e:elist) {
			tset.add(e);
		}
		return tset;
	}


	@Override
	public List<Employee> sortByName() {
		Comparator<Employee> c=(o1,o2)->{
			System.out.println("in name comparator "+o1.getName()+"-----"+o2.getName());
			return o1.getName().compareTo(o2.getName());
		};
		List<Employee> el=new ArrayList<>();
		for(Employee e:elist) {
			el.add(e);
		}
		el.sort(c);
		return el;
	}


	@Override
	public List<Employee> sortBySal() {
		Comparator<Employee> csal=(o1,o2)->{
			System.out.println("in sal comparator "+o1.getSalary()+"-----"+o2.getSalary());
			return (int)(o1.getSalary()-o2.getSalary());
		};
		List<Employee> el=new ArrayList<>();
		for(Employee e:elist) {
			el.add(e);
		}
		el.sort(csal);
		return el;
		
	} 
    
	}
	
	

