package com.demo.service;

import java.util.List;

import com.demo.beans.User;

public interface UserService {

	List<User> getAllStudents();

	void deleteUser(int id);


}
