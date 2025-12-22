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
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;
import com.demo.entity.*;


@WebServlet("/updateProduct")
public class UpdateProductReqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		if(user!=null && user.getRole().equals("admin")) {
			ProductService pService = new ProductServiceImpl();
			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			double price = Double.parseDouble(req.getParameter("price"));
			int qty = Integer.parseInt(req.getParameter("quantity"));
			int cid = Integer.parseInt(req.getParameter("cid"));
			Product p = new Product(id , name , price , qty , cid );
			boolean status = pService.updateProduct(p);
			System.out.println(status);
			if(status) {
				RequestDispatcher rd = req.getRequestDispatcher("productlist");
				rd.forward(req, res);
			}
			else {
				out.println("product not updates");
				RequestDispatcher rd = req.getRequestDispatcher("update?id="+id);
				rd.forward(req, res);
			}
		}
		else {
			out.println("<h2> Invalid user </h2>");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req,res);
	}

}
