package com.example.SpringBootRest.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;

@Controller
public class CustomUserDetailService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    System.out.println("In custom user detail service");
	    System.out.println(username);
	    if (!"samarth".equals(username)) {
	    	System.out.println(1111);
	        throw new UsernameNotFoundException("User not found");
	    }

	    return org.springframework.security.core.userdetails.User.builder()
	        .username("samarth")
	        .password("{noop}samarth")  // assign at least one role
	        .build();
	}


}
