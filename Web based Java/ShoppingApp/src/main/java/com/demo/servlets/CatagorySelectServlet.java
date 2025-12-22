package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.entity.*;
import com.demo.service.CatagoryService;
import com.demo.service.CatagoryServiceImpl;

@WebServlet("/catagoryselect")
public class CatagorySelectServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		HttpSession session =req.getSession();
		User user = (User) session.getAttribute("user");
		
		if(user!=null && user.getRole().equals("user")) {
			System.out.println(user);
			CatagoryService cService = new CatagoryServiceImpl();
			List<Catagory> cList = cService.getAllCatagories();
			if(cList!=null && cList.size()!=0) {
				out.println("<form action='fromCatagory' method='post'>");
				out.println("<select id='catagort' name='catagory'>");
				for(Catagory c : cList) {
					out.println("<option value="+c.getId()+">"+c.getName()+"</option>");
				}
				out.println("</select>");
				out.println("<button type='submit' name='btn' value='proList' id='btn'>Get Products</button>");
				out.println("<button type='submit' name='btn' value='cart' id='btn'>Go to cart</button>");
				out.println("</form>");
				
				out.println("<a href='Logout'>Logout</a>");
			}
			else {
				out.println("No catagory available");
				out.println("<a href='Logout'>Logout</a>");
			}
		}
	}
	
	public void doGet(HttpServletRequest req , HttpServletResponse resp) throws IOException, ServletException {
		doPost(req , resp);
	}
}
