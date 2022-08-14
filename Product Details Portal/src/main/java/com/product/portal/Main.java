package com.product.portal;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/detail")
public class Main extends HttpServlet {

	protected void details(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter output = resp.getWriter();
		resp.setContentType("text/html");
		output.println("<title align='center'>Add Product</tile>");
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			String product = req.getParameter("product");
			float price = Float.parseFloat(req.getParameter("price"));
			String status = req.getParameter("status");
			
			ProductClass values = new ProductClass(id, product,price, status);
			
			HttpSession session = req.getSession();
			
			session.setAttribute("data",values);
			req.setAttribute("data",values.getDetailst());
			RequestDispatcher direct = req.getRequestDispatcher("productdetails.jsp");
			direct.forward(req, resp);
		}catch(Exception message) {
			output.println("Error in main class:"+message);
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		details(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		details(req, resp);
	}
}