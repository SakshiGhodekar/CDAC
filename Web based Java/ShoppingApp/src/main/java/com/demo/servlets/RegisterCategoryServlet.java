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

import com.demo.entity.Catagory;
import com.demo.entity.Product;
import com.demo.entity.User;
import com.demo.service.CatagoryService;
import com.demo.service.CatagoryServiceImpl;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

/**
 * Servlet implementation class RegisterCategoryServlet
 */
@WebServlet("/registerCatagory")
public class RegisterCategoryServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		if(user!=null && user.getRole().equals("admin")){
			String cname = req.getParameter("cname");
			Catagory c = new Catagory(cname);
			CatagoryService cService = new CatagoryServiceImpl();
			boolean status = cService.addCategory(c);
			if(status) {
				out.println("<h3>Catagory registerd successfully</h3><br>");
				RequestDispatcher rd = req.getRequestDispatcher("productlist");
				rd.include(req, res);
		    }else {
				out.println("<h3>Please try again. Catagory alrady present in the list</h3><br>");
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
