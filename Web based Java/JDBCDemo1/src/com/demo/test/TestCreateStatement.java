package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class TestCreateStatement {

	public static void main(String[] args) {
		//step 1
		Connection conn=null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			///step 2
			String url="jdbc:mysql://192.168.10.117:3306/dac68?useSSL=false";
			
			conn=DriverManager.getConnection(url,"dac68","welcome");
			
			Statement st=conn.createStatement();
			ResultSet rst=st.executeQuery("select* from myproduct");
			while(rst.next()) {
				System.out.println("pid"+rst.getInt(1));
				System.out.println("pname"+rst.getString(2));
				System.out.println("qty"+rst.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
