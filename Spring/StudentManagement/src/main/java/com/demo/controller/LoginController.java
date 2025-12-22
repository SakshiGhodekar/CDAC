package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.User;
import com.demo.service.LoginService;
@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private LoginService lservice;
	@PostMapping("validate")
	public ModelAndView validateUser(HttpSession session ,@RequestParam  String useremail , @RequestParam String password) {
		
		User u = lservice.validateUser(useremail,password);
		if(u!=null) {
			session.setAttribute("user", u);
			if(u.getRole().toLowerCase().equals("student")) {
				return new ModelAndView("redirect:/user/studentview");
			}else {
				return new ModelAndView("redirect:/user/adminview");
			}
		}
		return new ModelAndView("login" , "msg" , "Invalid Login Details. Please try again" );
	}
}
