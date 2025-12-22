package com.demo.test;

import com.demo.service.*;
import java.util.*;
public class TestEmployeeCRUD {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int choice = 0;
		EmployeeService eservice=new EmployeeServiceImpl();
		ProjectService pservice=new ProjectServiceImpl();
		
		do {
			System.out.println("1. Add project");
			System.out.println("2. Add Employees");
		    System.out.println("3. show all employees");
		    System.out.println("4. delete employee");
			System.out.println("5. update Employees salary");
			System.out.println("6. Add employee in existing project");
			System.out.println("7. display employee in sorted order");
		    System.out.println("8. exit\nchoice:");
		    choice=sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status=pservice.addNewProject();
				if(status) {
					System.out.println("Project added successfully");
				}else {
					System.out.println("not added");
				}
			}
			case 2->{
				boolean status=eservice.addNewEmployee();
		    	if(status) {
		    		System.out.println("employee added successfully");
		    	}else {
		    		System.out.println("Not added");
		    	}
			}
			}
		}while(choice!=6);
		
	}

}
