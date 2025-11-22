package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.Product;
import com.demo.beans.*;
public class LoginDaoImpl implements LoginDao {
    static Connection conn=null;
     static PreparedStatement valUser;
     
     static {
    	 conn=DBUtil.getMyConnection();
    	 try {
			valUser=conn.prepareStatement("select uname,email,role from user where uname=? and password=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }

	@Override
	public User validateUser(String uname, String pass) {
		try {
			valUser.setString(1, uname);
			valUser.setString(2, pass);
			ResultSet rs=valUser.executeQuery();
			if(rs.next()) {
				User user=new User(rs.getString(1),rs.getString(2),rs.getString(3));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}
	

}
