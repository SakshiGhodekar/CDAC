package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;
import com.demo.entity.*;


@WebServlet("/register")
public class Register extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		UserService uService = new UserServiceImpl();
		User u = new User(name , "user" , email);
		
		 boolean status=uService.registerUser(u);
		 
		 if(status) {
			 out.println("<h4>User Registerd Successfully</h4>");
			 out.println("use username as password for first time.");
			 RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			 rd.include(req, res);
		 }else {
			 out.println("<h4>Something went wrong! please try again.</h4>");
			 RequestDispatcher rd = req.getRequestDispatcher("Register.html");
			 rd.include(req, res); 
		 }
	}

}
