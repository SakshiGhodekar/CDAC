package com.demo.dao;

import com.demo.beans.Product;
import com.demo.beans.User;

public interface LoginDao {

	
	User validateUser(String uname, String pass);

}
