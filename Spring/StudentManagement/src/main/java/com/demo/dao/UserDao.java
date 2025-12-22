package com.demo.dao;

import java.util.List;

import com.demo.beans.User;

public interface UserDao {

	List<User> findAllStudents();


	void removeUserById(int id);

}
