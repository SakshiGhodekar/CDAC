package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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

@WebServlet("/displayProduct")
public class DisplayByCatIdServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest req ,HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		
		if(user!=null && user.getRole().equals("user")) {
			int cid = Integer.parseInt(req.getParameter("id"));
			ProductService pService = new ProductServiceImpl();
			List<Product> plist = pService.getByCatagory(cid);
			if(plist!=null && plist.size()>0) {
				out.println("<form action='addToCart' method='post'>");
				for(Product p : plist) {
					out.println("<input  type='checkbox'name='cartProd' id='cb' value='"+p.getId()+"' />" );
					out.println(p.getId() + "<br>");
					out.println(p.getName() + "<br>");
					out.println(p.getPrice() + "<br>");
					out.println( "<br>------------------------------------------<br>");
					
				}
				out.println("<button type='submit' name='btn' id='btn'> Add to cart </button>");
				out.println("</form>");
				out.println("<br><br><a href='Logout'>Logout</a>");
			}
			else {
				out.println("product not found !");
				out.println("<br><br><a href='Logout'>Logout</a>");
			}
		}
		else {
			out.println("<h2> Invalid user </h2>");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
	}

}
