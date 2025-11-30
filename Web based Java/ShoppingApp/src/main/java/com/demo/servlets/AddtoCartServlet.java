package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;

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

@WebServlet("/addToCart")
public class AddtoCartServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		HttpSession session =req.getSession();
		User user = (User) session.getAttribute("user");
		
		if(user!=null && user.getRole().equals("user")) {
			   @SuppressWarnings("unchecked")
		        HashMap<Integer, Product> map = (HashMap<Integer, Product>) session.getAttribute("cart");
		        
		        if (map == null) {
		            map = new HashMap<>();
		            session.setAttribute("cart", map);
		        }

		        String[] arr = req.getParameterValues("cartProd");

		        ProductService pService = new ProductServiceImpl();
		        
		        if (arr != null) {
		            pService.addProductInCart(arr, map);
		        }
			
			RequestDispatcher rd = req.getRequestDispatcher("catagoryselect");
			rd.forward(req, res);
			
		}
		else {
			out.println("<h2> Invalid user </h2>");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
	}

}
