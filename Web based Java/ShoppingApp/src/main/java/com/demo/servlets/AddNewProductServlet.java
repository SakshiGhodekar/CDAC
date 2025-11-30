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

import com.demo.entity.Catagory;
import com.demo.entity.User;
import com.demo.service.CatagoryService;
import com.demo.service.CatagoryServiceImpl;

/**
 * Servlet implementation class AddNewProductServlet
 */
@WebServlet("/addproduct")
public class AddNewProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		if(user!=null && user.getRole().equals("admin")){
			
			CatagoryService cService = new CatagoryServiceImpl();
			List<Catagory> cList = cService.getAllCatagories();
			
			out.println("<form action='registerProduct' method='post'>");
		      out.println("Enter Product name : <input type='text' name='name' id='name'><br>");
		      out.println("Enter Product quantity : <input type='number' name='qty' id='qty'><br>");
		      out.println("Enter Product Price : <input type='number' name='price' id='price'><br>");
		      out.println("<select id='catagort' name='catagory'>");
				for(Catagory c : cList) {
					out.println("<option value="+c.getId()+">"+c.getName()+"</option>");
				}
				out.println("</select>");
				out.println("<button type='submit'>Add new product</button>");
		      out.println("</form>");
		      
		      out.println("<br><br><a href='Logout'>LogoutLogout</a>");
		      
		      
		}else {
			out.println("<h2> Invalid user </h2>");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, res);
		}
	}

}
