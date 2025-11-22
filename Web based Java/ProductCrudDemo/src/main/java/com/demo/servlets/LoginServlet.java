package com.demo.servlets;
import com.demo.beans.*;
import com.demo.service.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		LoginService lser=new LoginServiceImpl();
		User p= lser.validateUser(uname,pass);
		if(p!=null) {
			out.println("valid");
		}else {
			out.println("invalid");
			RequestDispatcher rd=req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
		
	}

}
