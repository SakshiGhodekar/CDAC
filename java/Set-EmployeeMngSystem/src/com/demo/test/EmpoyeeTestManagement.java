package com.demo.test;
import com.demo.beans.*;
import java.util.*;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
public class EmpoyeeTestManagement {

	public static void main(String[] args) {
	
		 Scanner sc=new Scanner(System.in);
		 
		 EmployeeService eser=new EmployeeServiceImpl();
		 int choice;
		 do {
			 System.out.println("1. add new employee\n 2. display all\n3. search by id");
				System.out.println("4. Search by name\n 5. update sal\n6. delete by id\n7. delete by salary\n");
				System.out.println("8. search by salary \n 9. sort by salary\n10. Sort By name\n 11. Sort By id\n12. exit\n choice: ");
				
				choice=sc.nextInt();
			 switch(choice) {
			 case 1->{
				boolean status=eser.addNewEmploye();
				if(status) {
					System.out.println("added successfully");
				}
				else {
					System.out.println("not found");
				}
			 }
			 case 2->{
				 Set<Employee>eset=eser.displayAll();
				 eset.forEach(System.out::println);
			 }
			 case 3->{
				 System.out.println("enter id");
				 int id=sc.nextInt();
				 Employee e=eser.findById(id);
				 if(e!=null) {
					 System.out.println(e);
				 }
				 else {
					 System.out.println("not found");
				 }
			 }
			 case 4->{
				 System.out.println("Enter name");
				 String nm=sc.next();
				 Set<Employee> e=eser.SearchByName(nm);
				 if(e!=null) {
					 e.forEach(System.out::println);
				 }
				 else {
					 System.out.println("not found");
				 }
				 
				 
			 }
			 case 5->{
				 System.out.println("enter id");
					int id=sc.nextInt();
					
					System.out.println("enter sal");
					double sal =sc.nextDouble();
					
					boolean status = eser.updateBySal(id,sal);
					if(status) {
						System.out.println("Updated successfully");
						
					}
					else {
						System.out.println("Not found");
					}
					
			 }
			 case 6->{
				 System.out.println("Enter id to Delete");
					int id = sc.nextInt();
					boolean status =eser.deleteById(id);
					if(status) {
						System.out.println("Deleted successfully");
						
					}
					else {
						System.out.println("Not found");
					}
			 }
             case 7->{
            	 System.out.println("enter Salary");
     			double sal =sc.nextDouble();
     			boolean status =eser.deleteBySal(sal);
     			if(status) {
     				System.out.println("Deleted successfully");
     				
     			}
     			else {
     				System.out.println("Not found");
     			}
				 
			 }
             case 8->{
				 
			 } 
             case 9->{
            	 List<Employee> elist=eser.sortBySal();
     			elist.forEach(System.out::println);
			 }
             case 10->{
            	 List<Employee> elist=eser.sortByName();
     			elist.forEach(System.out::println);
			 } 
             case 11->{
            	 Set<Employee> elist=eser.sortById();
     			elist.forEach(System.out::println);
			 }
             case 12->{
				System.out.println("Thanks for visiting"); 
			 }
             default->{
     			System.out.println("wrong choice");
     		}
			 }
		 }while(choice!=12);
	
	}

}
