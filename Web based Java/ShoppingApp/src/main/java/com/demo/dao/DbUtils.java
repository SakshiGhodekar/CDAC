package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
    private static Connection conn = null;
    
    private DbUtils() {
    	
    }
    
    public static Connection getMyConnection() {
    	if(conn==null) {
    		try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url = "jdbc:mysql://192.168.10.117:3306/dac72?useSLL=false";
				conn = DriverManager.getConnection( url , "dac72" , "welcome");
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
    	}
    	return conn;
    }
    
    public static void closeConnection() {
    	try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
