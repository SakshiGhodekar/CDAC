package com.example.SpringBootRest.security;

import java.util.Collection;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.SpringBootRest.beans.User;

public class CustomUserDetails implements UserDetails {
	
	User u;
	
	public CustomUserDetails(User u) {
		this.u=u;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority(u.getRole()));
	}

	@Override
	public @Nullable String getPassword() {
		return u.getPassword();
	}

	@Override
	public String getUsername() {
		return u.getName();
	}

}
