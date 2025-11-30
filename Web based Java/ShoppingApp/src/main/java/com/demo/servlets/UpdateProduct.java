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

import com.demo.entity.Product;
import com.demo.entity.User;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

@WebServlet("/update")
public class UpdateProduct extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		if(user!=null && user.getRole().equals("admin")) {
			ProductService pService = new ProductServiceImpl();
			int id = Integer.parseInt(req.getParameter("id"));
			Product p = pService.getProductById(id);
			if(p!=null) {
				out.println("<form action='updateProduct' method='get'>");
				out.println("Product Id :<input type='number' name='id' id='id' readonly value='"+p.getId()+"'><br>");
				out.println("Product Name :<input type='text' name='name' id='name' value='"+p.getName()+"'><br>");
				out.println("Product Price:<input name='price' id='price'  value='"+p.getPrice()+"'><br>");
				out.println("Product Quantity :<input name='quantity' id=''  value='"+p.getQty()+"'><br>");
				out.println("Product Catagory id :<input name='cid' id='cid'  value='"+p.getCategortId()+"'><br>");
				out.println("<button type='submit' id='btn' name='btn' value='btn'> Update </button><br>");
				out.println("</form>");
				
				out.println("<br><br><a href='Logout'>Logout</a>");
			}
			else {
				out.println("product not found");
				
				out.println("<br><br><a href='Logout'>Logout</a>");
			}
		}else {
			out.println("<h2> Invalid user </h2>");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
	}
}
