package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.User;

@Repository
public class LoginDaoImpl implements LoginDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public User findUser(String username, String password) {
		try {
	   User u=jdbcTemplate.queryForObject("select * from user where email=? and password=?",
			   new Object[] {username,password},
			   BeanPropertyRowMapper.newInstance(User.class)); 
		return u;
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}

}
