package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.entity.User;

public class UserDaoImpl implements UserDao{
	
	private static Connection conn ;
	
	static {
		conn = DbUtils.getMyConnection();
	}

	@Override
	public User findByNameAndPassword(String userName, String password) {
		try {
			PreparedStatement pst = conn.prepareStatement("select id , name , role , email from user where name=? and password=?");
			pst.setString(1, userName);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return new User(rs.getInt(1) , rs.getString(2) , rs.getString(3) , rs.getString(4));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(User u) {
		try {
			PreparedStatement pst = conn.prepareStatement("insert into user (name , password , email) values(? , ? ,?)");
			pst.setString(1, u.getName());
			pst.setString(2, u.getName());
			pst.setString(3, u.getEmail());
			int n = pst.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updatePasswordById(String email, String p1) {
		try {
			PreparedStatement pst = conn.prepareStatement("update user set password=? where email=?");
			pst.setString(1,p1);
			pst.setString(2,email);
			int n = pst.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
