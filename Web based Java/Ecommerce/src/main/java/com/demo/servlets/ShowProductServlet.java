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

import com.demo.bean.Product;
import com.demo.bean.User;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


@WebServlet("/ShowProduct")
public class ShowProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ProductService pservice=new ProductServiceImpl();
		HttpSession session=request.getSession();
		User user=(User)session.getAttribute("user");
		if(user!=null) {
		if(user.getRole().equals("user")) {
			List<Product> plist=pservice.getAllProducts();
			request.setAttribute("plist", plist);
			RequestDispatcher rd=request.getRequestDispatcher("HomePage.jsp");
			rd.forward(request, response);
			
			
		}else if( user.getRole().equals("admin")) {
			List<Product> plist=pservice.getAllProducts();
			request.setAttribute("plist", plist);
			RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);
			
		
		}else {
			//if user is invalid
			out.print("<h1>Invalid credentials</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}	
		}
		
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		doPost(request,response);
	}
	
	

}

