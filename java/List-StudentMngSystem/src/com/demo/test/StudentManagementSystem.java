package com.demo.test;
import java.io.PrintStream;

import java.util.*;
import com.demo.beans.Student;
import com.demo.service.*;
public class StudentManagementSystem {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
     StudentService st=new StudentServiceImpl();
     int choice;
     do {
    	
    	 System.out.println("1.Add new Student\n2.display all\n3.Search by Id");
    	 System.out.println("4.Search by name\n5.Update marks1\n6.Update marks2\n7.delete by id");
    	 System.out.println("8.delete by avg marks\n9.sort by id\n10.sort by name\n11.sort by marks1\n12.sort by marks2");
    	 System.out.println("13.exit");
    	 System.out.println("enter choice");
    	 choice=sc.nextInt();
    	 
    	 switch(choice) {
    	 case 1->{
    		 boolean status=st.addNewStudent();
    		 if(status) {
    			 System.out.println("added successfully");
    		 }
    		 else {
    			 System.out.println("not found");
    		 }
    	 }
    	 case 2->{
    		 List <Student> slist=st.displayAll();
    		 slist.forEach(System.out::println);
    	 }
    	 case 3->{
    		 System.out.println("enter id for search");
    		 int id=sc.nextInt();
    		 Student s= st.FindById(id);
    		 if(s!=null) {
    			 System.out.println(s);
    		 }else {
    			 System.out.println("not found");
    		 }
    	 }
    	 case 4->{
    		 System.out.println("enter name for search");
    		 String name=sc.next();
    		 List<Student>slist=st.FindByName(name);
    		 if(slist!=null) {
    			 slist.forEach(System.out::println);
    			 
    		 }
    		 else {
    			 System.out.println("not found");
    		 }
    	 }
    	 case 5->{
    		 System.out.println("enter id");
    		 int id=sc.nextInt();
    		 System.out.println("enter marks1 to update");
    		 int marks1=sc.nextInt();
    		 boolean status=st.updateByMarks(id,marks1);
    		 if(status) {
    			 System.out.println("updated successfully");
    		 }else {
    			 System.out.println("not found");
    		 }
    	 }
    	 case 6->{
    		 System.out.println("enter id");
    		 int id=sc.nextInt();
    		 System.out.println("enter marks2 to update");
    		 int marks2=sc.nextInt();
    		 boolean status=st.updateByMarks2(id,marks2);
    		 if(status) {
    			 System.out.println("updated successfully");
    		 }else {
    			 System.out.println("not found");
    		 }
    	 }
    	 case 7->{
    		 System.out.println("enter id");
    		 int id=sc.nextInt();
    		 boolean status=st.deleteById(id);
    		 if(status) {
    			 System.out.println("deleted successfully");
    		 }
    		 else {
    			 System.out.println("not found");
    		 }
    	 }
    	 case 8->{
    		 System.out.println("enter avg marks");
    		 double avg=sc.nextDouble();
    		 boolean status=st.deleteByAvg(avg);
    		 
    		 if(status) {
    			 System.out.println("deleted successfully");
    		 }
    	 }
    	 case 9->{
    		 List<Student> sl=st.sortById();
    		 sl.forEach(System.out::println);
    	 }
    	 }
     }while(choice!=13);
	}

	private static PrintStream println() {
		return null;
	}

}
