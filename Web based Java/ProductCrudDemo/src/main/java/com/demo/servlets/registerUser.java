package com.demo.servlets;
import com.demo.beans.*;
import com.demo.service.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class registerUser extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6369179986468369137L;

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();	
		
		String name=req.getParameter("name");
		String email=req.getParameter("mail");
		String Password=req.getParameter("pass");
		
		User u= new User(name,Password,email,"user");
		RegisterService rser=new RegisterServiceImpl();
		boolean status=rser.addUser(u);
		if(status) {
			out.println("<h1>User added successfully</h1>");
			RequestDispatcher rd= req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
		else {
			out.println("<h1>Something went wrong</h1>");
			RequestDispatcher rd= req.getRequestDispatcher("register.html");
			rd.include(req, res);
		}
		
	}

}
