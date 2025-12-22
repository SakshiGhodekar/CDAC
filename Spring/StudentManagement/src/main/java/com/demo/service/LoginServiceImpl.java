package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.User;
import com.demo.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginDao ldao;

	public User validateUser(String username, String password) {
		
		return ldao.findUser(username,password);
	}

}
