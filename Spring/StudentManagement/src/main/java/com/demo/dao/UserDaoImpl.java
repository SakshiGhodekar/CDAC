package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.User;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<User> findAllStudents() {
		List<User> uList = jdbcTemplate.query("select *  from user where role="+"'Student'" , (rs , n)->{
			User u = new User();
			u.setId(rs.getInt(1));
			u.setName(rs.getString(2));
			u.setEmail(rs.getString(5));
			u.setAddress(rs.getString(4));
			u.setRole(null);
			u.setPassword(null);
			u.setDob(rs.getDate(6).toLocalDate());
			return u;
		});
		return uList;
	}

	public void removeUserById(int id) {
		jdbcTemplate.update("delete from user where id =?" , new Object[] {id});
		
	}
	
	
}
