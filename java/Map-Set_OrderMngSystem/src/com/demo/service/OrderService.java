package com.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.demo.beans.Custemer;
import com.demo.beans.Item;

public interface OrderService {

	boolean addNewCustemer();

	Map<Custemer, List<Item>> displayAll();

	Entry<Custemer, List<Item>> displayByCustomerId(int cId);

	boolean deleteByCustomerId(int cId);

	boolean addNewItem(int cid, Item item);

	boolean removeItemById(int cid, int iid);

}
