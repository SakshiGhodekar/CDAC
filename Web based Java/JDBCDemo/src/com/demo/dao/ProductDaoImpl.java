package com.demo.dao;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao {
	static Connection conn=null;
	static PreparedStatement insProd ;
	static PreparedStatement display;
	static PreparedStatement deleteById;
	static PreparedStatement modifyById;
	static PreparedStatement findById;
	static PreparedStatement sortByPrice;
	static {
		conn=DBUtil.getConnection();
		try {
			insProd=conn.prepareStatement("insert into myproduct values(?,?,?,?,?)");
			display=conn.prepareStatement("select * from myproduct");
			deleteById=conn.prepareStatement("delete from myproduct where pid=?");
			modifyById=conn.prepareStatement("update myproduct set qty=? where pid=?");
			findById=conn.prepareStatement("select * from myproduct where pid=?");
			sortByPrice=conn.prepareStatement("select * from myproduct order by price");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Override
	public boolean save(Product p) {
		try {
			insProd.setInt(1, p.getPid());
			insProd.setString(2, p.getPname());
			insProd.setInt(3, p.getQty());
			insProd.setDouble(4, p.getPrice());
			insProd.setDate(5, java.sql.Date.valueOf(p.getLdt()));
			int n=insProd.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	@Override
	public List<Product> displayAll() {
		List<Product>plist=new ArrayList<>();
		
			try {
				ResultSet rst=display.executeQuery();
				while(rst.next()) {
					if(rst.getDate(5)!=null) {
						plist.add(new Product(rst.getInt(1),rst.getString(2),rst.getInt(3),rst.getDouble(4),rst.getDate(5).toLocalDate()));
					}else {
						plist.add(new Product(rst.getInt(1),rst.getString(2),rst.getInt(3),rst.getDouble(4),null));
					}
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			if(plist.size()>0) {
				return plist;
			}else {
				return null;
			}
			
		
	}
	@Override
	public boolean deleteById(int id) {
	 try {
		deleteById.setInt(1,id);
		int n= deleteById.executeUpdate();
		if(n>0) {
			return true;
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	 
		return false;
	}
	@Override
	public boolean modifyById(int id, int qty) {
	
	try {
		modifyById.setInt(1, qty);
		modifyById.setInt(2, id);
		int n=modifyById.executeUpdate();
		if(n>0) {
			return true;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return false;
	}
	@Override
	public Product findById(int id) {
		try {
			findById.setInt(1, id);
			ResultSet rs=findById.executeQuery();
			Product p=null;
			if(rs.getDate(5)!=null) {
				p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5).toLocalDate());
			}else {
				p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),null);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	public List<Product> sortByPrice() {
		List<Product>plist=new ArrayList<>();
		try {
			ResultSet rst=sortByPrice.executeQuery();
			
			while(rst.next()) {
				if(rst.getDate(5)!=null) {
					plist.add(new Product(rst.getInt(1),rst.getString(2),rst.getInt(3),rst.getDouble(4),rst.getDate(5).toLocalDate()));
				}else {
					plist.add(new Product(rst.getInt(1),rst.getString(2),rst.getInt(3),rst.getDouble(4),null));
				}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(plist.size()>0) {
			return plist;
		}else {
			return null;
		}
		
	}
	@Override
	public Object closeMyConnection() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
