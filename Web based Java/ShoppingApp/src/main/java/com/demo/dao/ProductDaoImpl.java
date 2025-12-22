package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.demo.entity.Product;

public class ProductDaoImpl implements ProductDao {
	private static Connection conn ;
	
	static {
		conn = DbUtils.getMyConnection();
	}

	@Override
	public List<Product> findAll() {
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement("select * from productPro");
			ResultSet rs = pst.executeQuery();
			List<Product> pList = new ArrayList<>();
			while(rs.next()) {
				Product p = new Product( rs.getInt(1) , rs.getString(2) , rs.getDouble(3) , rs.getInt(4) , rs.getInt(5));
			    pList.add(p);
			}
			return pList;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Boolean removeById(int id) {
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement("delete from productpro where product_id=?");
			pst.setInt(1, id);
			int n = pst.executeUpdate();
			if(n>0)
			return true;
			return false;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Product findById(int id) {
		try {
			PreparedStatement pst = conn.prepareStatement("select * from productpro where product_id=?");
			pst.setInt(1, id);
			ResultSet rs =pst.executeQuery();
			if(rs.next()) {
				System.out.println(112233);
				return new Product( rs.getInt(1) , rs.getString(2) , rs.getDouble(3) , rs.getInt(4) , rs.getInt(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public boolean save(Product p) {
		try {
			PreparedStatement pst = conn.prepareStatement("insert into productpro (  name , price , stock_quantity , category_id ) values (? ,? ,? ,? )");
			pst.setString(1 , p.getName());
			pst.setDouble(2, p.getPrice());
			pst.setInt(3, p.getQty());
			pst.setInt(4, p.getCategortId());
			int n = pst.executeUpdate();
			return n>0;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean UpdateById(Product p) {
		try {
			PreparedStatement pst = conn.prepareStatement("UPDATE productPro SET name = ?, price = ?, stock_quantity = ? ,category_id=? WHERE product_id = ?");
			pst.setInt(5, p.getId() );
			pst.setString(1 , p.getName());
			pst.setDouble(2, p.getPrice());
			pst.setInt(3, p.getQty());
			pst.setInt(4, p.getCategortId());
			int n = pst.executeUpdate();
			System.out.println(n);
			if(n>0)
			return true;
			return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Product> findByCatagoty(int cid) {
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement("select * from productPro where category_id=?");
			pst.setInt(1, cid);
			ResultSet rs = pst.executeQuery();
			List<Product> pList = new ArrayList<>();
			while(rs.next()) {
				Product p = new Product( rs.getInt(1) , rs.getString(2) , rs.getDouble(3) , rs.getInt(4) , rs.getInt(5));
			    pList.add(p);
			}
			return pList;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void addProductInCart(String[] arr, HashMap<Integer, Product> map) {
		if(map==null) {
			map = new HashMap<>();
		}
		for(String s : arr) {
			int id = Integer.parseInt(s);
			Product p = findById(id);
			if(map.containsKey(id)) {
				Product product = map.get(id);
				product.setQty(product.getQty()+1);
			}else {
				p.setQty(1);
				map.put(id , p);
			}
		}
		
	}
}
