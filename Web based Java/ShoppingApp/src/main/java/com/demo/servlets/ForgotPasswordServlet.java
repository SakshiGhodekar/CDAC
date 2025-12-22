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

@WebServlet("/forgotPss")
public class ForgotPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("Text/html");
		PrintWriter out = res.getWriter();
		String email = req.getParameter("email");
		String p1 = req.getParameter("p1");
	    String p2= req.getParameter("p1");
	    if(!p1.equals(p2)) {
	    	out.println("password not matches");
	    	RequestDispatcher rd = req.getRequestDispatcher("ForgotPass.html");
	    	rd.include(req, res);
	    }else {
	    	UserService uservice = new UserServiceImpl(); 
	    	boolean status = uservice.changePass(email , p1);
	    	if(status) {
	    		out.println("password changed successfully.");
		    	RequestDispatcher rd = req.getRequestDispatcher("Login.html");
		    	rd.include(req, res);
	    	}else {
	    		out.println("invalid email");
		    	RequestDispatcher rd = req.getRequestDispatcher("ForgotPass.html");
		    	rd.include(req, res);
	    	}
	    }
	}

}
