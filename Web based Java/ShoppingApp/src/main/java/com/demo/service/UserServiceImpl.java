package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.entity.User;

public class UserServiceImpl implements UserService{
	UserDao dao ;
	public UserServiceImpl() {
		super();
		dao = new UserDaoImpl();
	}
	@Override
	public User validateUser(String userName, String password) {
		return dao.findByNameAndPassword(userName , password);
	}
	@Override
	public boolean registerUser(User u) {
		return dao.save(u);
	}
	@Override
	public boolean changePass(String email, String p1) {
		return dao.updatePasswordById(email , p1);
	}

}
