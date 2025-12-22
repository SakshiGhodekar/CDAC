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

import com.demo.entity.*;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

@WebServlet("/delete")
public class DeleteProduct extends HttpServlet {
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession();
		User user =(User)session.getAttribute("user");
		if(user!=null && user.getRole().equals("admin")) {
			ProductService pService = new ProductServiceImpl();
			int id = Integer.parseInt(req.getParameter("id"));
			System.out.println(id);
			Boolean status = pService.deleteProductById(id);
			if(status) {
				RequestDispatcher rd = req.getRequestDispatcher("productlist");
				rd.forward(req, res);
			}
			else {
				out.println("<h2> Invalid user </h2>");
				RequestDispatcher rd = req.getRequestDispatcher("Login.html");
				rd.include(req, res);
			}
		}else{
			out.println("<h2> Invalid user </h2>");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
	}
}
