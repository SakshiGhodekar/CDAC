package com.demo.dao;

import com.demo.entity.User;

public interface UserDao {

	User findByNameAndPassword(String userName, String password);

	boolean save(User u);

	boolean updatePasswordById(String email, String p1);

}
