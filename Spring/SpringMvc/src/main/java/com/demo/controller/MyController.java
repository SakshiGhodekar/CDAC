package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@GetMapping("hello")
	public String helloController() {
		return "hello";
	}
	
	@GetMapping("/welcome")
	public ModelAndView welcomeController() {
		return new ModelAndView("welcome" , "msg" , "this is welcome message from controller");
	}
	
	@GetMapping("/test")
	public String testController(Model m) {
		m.addAttribute("username" , "abcd");
		m.addAttribute("password" , "abcd");
		return "test";
	}
}
