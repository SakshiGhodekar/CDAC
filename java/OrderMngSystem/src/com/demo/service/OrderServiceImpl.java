package com.demo.service;
import java.util.*;
import java.util.Map.Entry;

import com.demo.beans.*;
import com.demo.dao.*;
public class OrderServiceImpl implements OrderService {
  private OrderDao odao;
  
  public OrderServiceImpl() {
	  odao=new OrderDaoImpl();
  }
	@Override
	public boolean addNewCustemer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter custemer id");
		int cid=sc.nextInt();
		System.out.println("enter customer name");
		String cname=sc.next();
		System.out.println("enter mobile no");
		String mob=sc.next();
		Custemer c=new Custemer(cid,cname,mob);
		List<Item>lst=new ArrayList<>();
		String ans=null;
		
		do {
			System.out.println("enter item id");
			int id=sc.nextInt();
			System.out.println("enter item name");
			String name=sc.next();
			System.out.println("enter qty");
			int qty=sc.nextInt();
			System.out.println("enter price");
			double pr=sc.nextDouble();
			Item item=new Item(id,name,qty,pr);
			lst.add(item);
			System.out.println("do u want to continue");
			ans=sc.next();
		}while(ans.equals("y"));
		
		return odao.save(c,lst);
	}
	@Override
	public Map<Custemer, List<Item>> displayAll() {
		
		return odao.findAll();
	}
	@Override
	public Entry<Custemer, List<Item>> displayByCustomerId(int cId) {
		return odao.findByCustomerId(cId);
	}
	@Override
	public boolean deleteByCustomerId(int cId) {
		return odao.deleteByCustomerId(cId);
	}
	@Override
	public boolean addNewItem(int cid, Item item) {
		return odao.addItem(cid,item);
		
	}
	@Override
	public boolean removeItemById(int cid, int iid) {
		
		return odao.removeItem(cid,iid);
	}

}
