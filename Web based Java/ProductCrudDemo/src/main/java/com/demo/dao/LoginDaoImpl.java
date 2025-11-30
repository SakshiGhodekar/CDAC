package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.*;
public class LoginDaoImpl implements LoginDao {
    static Connection conn=null;
     static {
    	 conn=DBUtil.getMyConnection();	
     }

	@Override
	public User validateUser(String uname, String pass) {
		 
		try {
			PreparedStatement valUser = conn.prepareStatement("select uname,password,email,role from user where uname=? and password=?");
			valUser.setString(1, uname);
			valUser.setString(2, pass);
			ResultSet rs=valUser.executeQuery();
			if(rs.next()) {
				User user=new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}

	@Override
	public boolean addUser(User u) {
		
		
		try {
			PreparedStatement addUser=conn.prepareStatement("insert into User (name , password , email) values(?,?,?,?)");
			addUser.setString(1, u.getUname());
			addUser.setString(2,u.getPass() );
			addUser.setString(3, u.getEmail());
			int n=addUser.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	

}
