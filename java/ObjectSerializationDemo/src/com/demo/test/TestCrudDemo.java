package com.demo.test;
import java.util.*;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
public class TestCrudDemo {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
    EmployeeService eservice=new EmployeeServiceImpl();
    eservice.readFile("empdata.txt");
    int choice=0;
    
    do {
    	System.out.println("1. add new Employee\n2. delete by id\n");
		System.out.println("3. modify by id\n4.display all\n5. display by id\n6. exit\nchoice: ");
		choice=sc.nextInt();
    	switch(choice) {
    	case 1->{
    		boolean status=eservice.addNewEmployee();
    		if(status) {
    			System.out.println("added successfully");
    		}else {
    		System.out.println("not added");
    	}
    		
    	}
    	case 2->{
    		System.out.println("enter id");
    		int id=sc.nextInt();
    		boolean status=eservice.deletById(id);
    		if(status) {
    			System.out.println("deleted successfully");
    		}else {
    			System.out.println("not found");
    		}
    	}
    	case 3->{
    		System.out.println("enter id to modify");
    		int id=sc.nextInt();
    		
    		System.out.println("enter sal");
    		double sal=sc.nextDouble();
    				
    		boolean status=eservice.modifyById(id,sal);
    		if(status) {
    			System.out.println("modify successfully");
    		}else {
    			System.out.println("not found");
    		}
    	}
    	case 4->{
    		List <Employee> list=eservice.displayAll();
    		
          list.forEach(System.out::println);
    	}
    	
    	case 5->{
    		System.out.println("enter id to dispaly");
    		int eid=sc.nextInt();
    		Employee ob =eservice.displayById(eid);
    	  if(ob!=null) {
    		  System.out.println(ob);
    	  }else {
    		  System.out.println("not found");
    	  }
    	}
    	case 6->{
			eservice.writeToFile("empdata.txt");
			sc.close();
			System.out.println("Thank you for visiting......");
		}
		default->{
			System.out.println("wrong choice");
		}
    	}
    }while(choice!=6);
    
    }
	}
