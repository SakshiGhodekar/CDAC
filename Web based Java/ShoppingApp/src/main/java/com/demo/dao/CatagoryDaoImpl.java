package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.demo.entity.Catagory;

public class CatagoryDaoImpl implements CatagoryDao{
	private static Connection conn ;
	
	static {
		conn = DbUtils.getMyConnection();
	}

	@Override
	public List<Catagory> findAll() {
		try {
			PreparedStatement pst = conn.prepareStatement("select * from categorypro");
			ResultSet rs=pst.executeQuery();
			List<Catagory> clist = new ArrayList<>();
			while(rs.next()) {
				Catagory c = new Catagory(rs.getInt(1) , rs.getString(2));
				clist.add(c);
			}
			return clist;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(Catagory c) {
		try {
			PreparedStatement pst = conn.prepareStatement("insert into categorypro (category_name) values (?)");
			pst.setString(1, c.getName());
			int n = pst.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
}
