package com.demo.service;

import com.demo.entity.User;

public interface UserService {

	public User validateUser(String userName, String password);

	public boolean registerUser(User u);

	public boolean changePass(String email, String p1);

}
