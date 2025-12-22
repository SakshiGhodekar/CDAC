package com.example.SpringBootRest.controller;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootRest.beans.LoginRequest;
import com.example.SpringBootRest.beans.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	AuthenticationManager am;
	
	
	@PostMapping("/loginUser")
	public ResponseEntity<String> authenticateUser(@RequestBody LoginRequest u){
		System.out.println("asdff");
		try {
			Authentication a = am.authenticate(
				    new UsernamePasswordAuthenticationToken(u.getUsername(), u.getPassword())
				);
			System.out.println("cccc");
			
		SecurityContextHolder.getContext().setAuthentication(a);
		
//		HttpSession session = request.getSession(true);
//	    session.setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY,
//	                         SecurityContextHolder.getContext());
//		System.out.println("2222");
		return ResponseEntity.ok("login successfully");
		}
		catch (Exception e) {
			// TODO: handle exception
			return  ResponseEntity.ok("validation failed");
		}
	}
}
