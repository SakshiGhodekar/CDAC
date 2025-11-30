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

import com.demo.entity.*;
import com.demo.service.*;

@WebServlet("/productlist")
public class ProductListServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req , HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		HttpSession session =req.getSession();
		User user = (User) session.getAttribute("user");
		
		if(user!=null && user.getRole().equals("admin")) {
			ProductService pservice = new ProductServiceImpl();
			List<Product> pList = pservice.getAllProducts();
			
			if(pList!=null && pList.size()>0) {
				
				out.println("<a href='addproduct'>Add new Product</a><br>");
				out.println("<a href='AddCatagory.html'>Add new catagory</a><br><br><br>");
				out.println("<table>");
				out.println("<tr><th>ID</th><th>NAME</th><th>PRICE</th><th>QUANTITY</th><th>CATAGORY ID</th><th>UPDATE</th><th>DELETE</th></tr>");
				
				for(Product p :pList) {
					out.println("<tr> <td>"+p.getId()+"</td> <td>"+p.getName()+"</td> <td>"+p.getPrice()+"</td> ");
					out.println(" <td>"+p.getQty()+"</td> <td>"+p.getCategortId()+"</td>");
					out.println(" <td> <a href='delete?id="+p.getId()+"'><button> Delete</button> </a></td> <td>");
					out.println(" <td> <a href='update?id="+p.getId()+"'><button> Update</button> </a></td> <td> </tr>");
					
				}
				
				out.println("</table>");
				
				
				
				out.println("<br><br><a href='Logout'>Logout</a>");
			}else {
				out.println("No Product Available");
				
				out.println("<br><br><a href='Logout'>Logout</a>");
			}
		}
		else{
			out.println("<h2> Invalid user </h2>");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, resp);
		}
	}
	
	
	public void doGet(HttpServletRequest req , HttpServletResponse resp) throws IOException, ServletException {
		doPost(req , resp);
	}
}
