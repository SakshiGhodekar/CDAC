package com.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.demo.beans.Custemer;
import com.demo.beans.Item;

public interface OrderDao {

	boolean save(Custemer c, List<Item> lst);

	Map<Custemer, List<Item>> findAll();

	Entry<Custemer, List<Item>> findByCustomerId(int cId);

	

	boolean deleteByCustomerId(int cId);

	boolean addItem(int cid, Item item);

	boolean removeItem(int cid, int iid);

	

}
