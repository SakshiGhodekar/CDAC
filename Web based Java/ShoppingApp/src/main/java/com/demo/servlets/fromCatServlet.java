package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.demo.entity.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/fromCatagory")
public class fromCatServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text.html");
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		
		if(user!=null && user.getRole().equals("user")) {
			String btn = req.getParameter("btn");
			int id = Integer.parseInt(req.getParameter("catagory"));
			if(btn.equals("proList")) {
				RequestDispatcher rd = req.getRequestDispatcher("displayProduct?id="+id);
				rd.forward(req, res);
			}
			else {
				RequestDispatcher rd = req.getRequestDispatcher("displayCart");
				rd.forward(req, res);
			}
		}
		else {
			out.println("<h2> Invalid user </h2>");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
		
	}
}
