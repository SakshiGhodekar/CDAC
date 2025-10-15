package com.demo.dao;
import com.demo.beans.*;
import java.util.HashMap;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.demo.beans.Custemer;
import com.demo.beans.Item;

public class OrderDaoImpl implements OrderDao {
 static Map<Custemer,List<Item>> hm;
  static {
	  hm =new HashMap<>();
	  Custemer c=new Custemer(1,"sakshi","6767867867");
	  List<Item>lst=new ArrayList<>();
	  lst.add(new Item(102,"chair",45,2344234));
	  lst.add(new Item(103,"tabler",65,5723444));
	  lst.add(new Item(104,"tabler",33,4444));
	  hm.put(c, lst);
	  Custemer c1=new Custemer(2,"riya","5467867");
	  List<Item>lst1=new ArrayList<>();
	  lst1.add(new Item(102,"chair",55,2344234));
	  lst1.add(new Item(103,"tabler",77,5723444));
	  lst1.add(new Item(104,"tabler",90,4444));
	  hm.put(c1, lst1);
  }
	@Override
	public boolean save(Custemer c, List<Item> lst) {
		if(!hm.containsKey(c)) {
			hm.put(c, lst);
			return true;
		}
		return false;
	}
	@Override
	public Map<Custemer, List<Item>> findAll() {
	
		return hm ;
	}
	@Override
	public Entry<Custemer, List<Item>> findByCustomerId(int cId) {
		Set<Map.Entry<Custemer , List<Item>>> set = hm.entrySet();
		for(Map.Entry<Custemer , List<Item>> e : set) {
			if(e.getKey().equals(new Custemer(cId))) {
				return e;
			}
		}
		return null;
	}
	@Override
	public boolean deleteByCustomerId(int cId) {
		Set<Custemer> set = hm.keySet();
		for(Custemer c : set) {
			if(c.equals(new Custemer(cId))) {
				set.remove(c);
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean addItem(int cid, Item item) {
		List<Item> i=hm.get(new Custemer(cid));
		if(i==null) {
			return false;
		}else {
			i.add(item);
			return true;
		}
	}
	@Override
	public boolean removeItem(int cid, int iid) {
		List<Item> lst=hm.get(new Custemer(cid));
		if(lst!=null) {
			//add equals method in Item class
			//also add constructor with only id in Item class
			return lst.remove(new Item(iid));
			
		}
		return false;
	}

}
