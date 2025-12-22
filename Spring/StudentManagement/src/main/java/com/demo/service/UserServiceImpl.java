package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.User;
import com.demo.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;

	public List<User> getAllStudents() {
		return userDao.findAllStudents();
	}

	@Override
	public void deleteUser(int id) {
		userDao.removeUserById(id);
	}
}
