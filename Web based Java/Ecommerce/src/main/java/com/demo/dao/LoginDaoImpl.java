package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.bean.User;

public class LoginDaoImpl implements LoginDao {
	static Connection conn=null;
	static {
		conn=DBUtil.getMyConnection();
	}
	@Override
	public User validateUser(String name, String pass) {
	try {
		PreparedStatement pst= conn.prepareStatement("select uname,pass,email,role from User where uname=? and pass=?");
		pst.setString(1, name);
		pst.setString(2, pass);
		ResultSet rst=pst.executeQuery();
		if(rst.next()) {
			User u=new User(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4));
		  return u;
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
	}

}
