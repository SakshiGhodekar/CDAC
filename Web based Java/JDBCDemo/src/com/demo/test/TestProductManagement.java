package com.demo.test;
import java.util.*;
import com.demo.service.*;
import com.demo.beans.*;
public class TestProductManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		ProductService pser= new ProductServiceImpl();
		do {
			System.out.println("1. add new product\n2. delete product\n3. modify product");
			System.out.println("4.find by Id\n5. display all\n6. display in sorted order\n7. exit");
			System.out.println("choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status=pser.addNewProduct();
				if(status) {
					System.out.println("product addedd successfully");
				}else {
					System.out.println("Not added");
				}
			}
			case 2->{
				System.out.println("enter id ");
				int id=sc.nextInt();
				boolean status=pser.deleteById(id);
				if(status) {
					System.out.println("deleted successfully");
				}else {
					System.out.println("not found");
				}
			}
			case 3->{
				System.out.println("enter pid");
				int id=sc.nextInt();
			    System.out.println("enter quantitty");
			    int qty=sc.nextInt();
			    boolean status=pser.modifyProduct(id,qty);
			    if(status) {
			    	System.out.println("updated successfully");
			    }else {
			    	System.out.println("not updated");
			    }
			}
			case 4->{
				System.out.println("enter id");
				int id=sc.nextInt();
				Product p=pser.getById(id);
				if(p==null) {
					System.out.println("product not found");
				}else {
					System.out.println(p);
				}
			}
			case 5->{
				List<Product> lst=pser.displayAllProduct();
				lst.forEach(System.out::println);
				
			}
			case 6->{
				List<Product> lst=pser.sortById();
				lst.forEach(System.out::println);
			}
			case 7->{
				System.out.println("Thank you for visiting .....");
				sc.close();
			}
			}
		}while(choice!=7);

	}

}
