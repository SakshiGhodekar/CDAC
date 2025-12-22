package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.entity.User;
import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("uname");
		String password = request.getParameter("password");
		UserService uservice = new UserServiceImpl();
		User user = uservice.validateUser(userName , password);
		if(user!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			if(user.getRole().equals("admin")) {
				
				RequestDispatcher rd = request.getRequestDispatcher("productlist");
				rd.forward(request, response);
			}
			else {
				if(userName.equals(password)) {
					out.println("plaese change the password.");
					RequestDispatcher rd = request.getRequestDispatcher("ForgotPass.html");
					rd.include(request, response);
				}else {
					RequestDispatcher rd = request.getRequestDispatcher("catagoryselect");
					rd.forward(request, response);
				}
			}
		}
		else{
			out.println("<h2> Invalid user </h2>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
	}

}
