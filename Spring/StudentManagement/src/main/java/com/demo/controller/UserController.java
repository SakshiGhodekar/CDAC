package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.User;
import com.demo.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/studentview")
	public ModelAndView studentView(HttpSession session) {
		User user = (User) session.getAttribute("user"); 
		if(user!=null && user.getRole().toLowerCase().equals("student")) {
			return new ModelAndView("ShowStudentData" , "user" , user);
		}
		return new ModelAndView("login" , "msg" , "Invalid Login Details. Please try again" );
	}
	
	@GetMapping("/adminview")
	public ModelAndView adminView(HttpSession session) {
		User user = (User) session.getAttribute("user"); 
		if(user!=null && user.getRole().toLowerCase().equals("teacher")) {
			List<User> uList = userService.getAllStudents();
			return new ModelAndView("ShowAdminPage" , "uList" , uList);
		}
		return new ModelAndView("login" , "msg" , "Invalid Login Details. Please try again" );
	}
	
	@GetMapping("delete/{id}")
	public ModelAndView deleteUser(HttpSession session ,@PathVariable int id) {
		User user = (User) session.getAttribute("user"); 
		if(user!=null && user.getRole().toLowerCase().equals("teacher")) {
			userService.deleteUser(id);
			return new ModelAndView("redirect:/user/adminview");
		}
		return new ModelAndView("login" , "msg" , "Invalid Login Details. Please try again" );

	}
	
	@GetMapping("Update/{id}")
	public ModelAndView UpdateUser(HttpSession session ,@PathVariable int id) {
		User user = (User) session.getAttribute("user"); 
		if(user!=null && user.getRole().toLowerCase().equals("teacher")) {
			userService.deleteUser(id);
			return new ModelAndView("redirect:/user/adminview");
		}
		return new ModelAndView("login" , "msg" , "Invalid Login Details. Please try again" );

	}

}
