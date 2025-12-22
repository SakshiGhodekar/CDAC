package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController {
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
		
	}
	@GetMapping("/test")
	public String testdata(Model model) {
		model.addAttribute("name", "sakshi");
		model.addAttribute("email", "abc@gmail.com");
		return "testdata";
		
	}
	@GetMapping("/welcome")
	public ModelAndView sayWelcome() {
		String msg="welcome";
		return new ModelAndView("welcome","message",msg);
	}
}
