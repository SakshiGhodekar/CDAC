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

/**
 * Servlet implementation class RegisterProductServlet
 */
@WebServlet("/registerProduct")
public class RegisterProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		if(user!=null && user.getRole().equals("admin")){
			String name = req.getParameter("name");
			int qty =Integer.parseInt(req.getParameter("qty"));
			double price =Double.parseDouble( req.getParameter("price"));
			int cid = Integer.parseInt(req.getParameter("catagory"));
			Product p = new Product(name ,  price, qty , cid);
			ProductService pService = new ProductServiceImpl();
			boolean status = pService.addProduct(p);
			if(status) {
				out.println("<h3>Product registerd successfully</h3><br><br>");
				RequestDispatcher rd = req.getRequestDispatcher("productlist");
				rd.include(req, res);
		    }else {
				out.println("<h3>Please try again</h3><br><br>");
				RequestDispatcher rd = req.getRequestDispatcher("RegisterProductServlet");
				rd.include(req, res);
			}
		}
		else {
			out.println("<h2> Invalid user </h2>");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
	}

}
