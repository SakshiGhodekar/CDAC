package com.demo.service;

import com.demo.bean.User;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{
	LoginDao dao;
	public LoginServiceImpl() {
		dao=new LoginDaoImpl();
	}
	@Override
	public User validateuser(String name, String pass) {
		
		return dao.validateUser(name,pass);
	}

}
