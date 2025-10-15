package com.demo.test;
import java.util.*;
import com.demo.beans.*;
import com.demo.service.*;
public class TestOrdemgntSystem {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
     OrderService oservice=new OrderServiceImpl();
     
     int choice;
     do {
    	 System.out.println("1. add new customer\n2. display all\n3. display by customer");
 		System.out.println("4. delete customer\n5. add a new item in existing order");
 		System.out.println("6. delete item from existing order\n7.exit\n choice:");
 		choice=sc.nextInt(); 
 		
 		switch(choice) {
 		
 		case 1->{
 			
 			boolean status=oservice.addNewCustemer();
 			if(status) {
 				System.out.println("added successfully");
 			}else {
 				System.out.println("not added");
 			}
 		}
 		case 2->{
 			Map<Custemer,List<Item>>l=oservice.displayAll();
 			Set<Custemer>c=l.keySet();
 			c.forEach(e-> System.out.println( e +"---->" + l.get(e)));
 		}
 		case 3->{
 			System.out.println("Enter customer id :");
 			int cId = sc.nextInt();
 		     Map.Entry<Custemer , List<Item>> entryset= oservice.displayByCustomerId(cId);
 			if(entryset!=null) {
 				System.out.println(entryset.getKey()+"---->"+entryset.getValue());
 			}else {
 				System.out.println("Not Found");
 			}
 		}
 		
 		case 4->{
 			System.out.println("Enter customer id :");
 			int cId = sc.nextInt();
 			boolean status = oservice.deleteByCustomerId(cId);
 			if(status) {
 				System.out.println("Customer Deleted Successfully.");
 			}
 			else {
 				System.out.println("Error : not found");
 			}
 		}
 		case 5 ->{
 			System.out.println("enter customer id");
 			int cid=sc.nextInt();
 			System.out.println("enter item id");
 			int iid=sc.nextInt();
 			System.out.println("enter item name");
 			String nm=sc.next();
 			System.out.println("enter qty");
 			int qty=sc.nextInt();
 			System.out.println("enter price");
 			double pr=sc.nextDouble();
 			
 			boolean status=oservice.addNewItem(cid,new Item(iid,nm,qty,pr));
 			
 			if(status) {
 				System.out.println("updated successfully");
 			}
 			else {
 				System.out.println("not ");
 			}
 		}
 		case 6->{
 			System.out.println("enter customer id");
 			int cid=sc.nextInt();
 			System.out.println("enter item id");
 			int iid=sc.nextInt();
 			
 			boolean status=oservice.removeItemById(cid,iid);
 			if(status) {
 				System.out.println("deleted successfully");
 			}else {
 				System.out.println("not deleted");
 			}
 			
 		}
 		
 		}
     }while(choice!=7);
     
	}

}
