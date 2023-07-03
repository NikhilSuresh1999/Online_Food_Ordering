package com.customer;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.customer.validateServlet;

@WebServlet("/log")
public class loginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse resp)throws IOException
	{
		String uname=req.getParameter("uname");
		String password=req.getParameter("password");
		boolean val=validateServlet.isvalid(uname,password);
		
		if(val==true && uname.equals("admin"))
		{
			resp.sendRedirect("admin.jsp");
			
		}
		else if(val==true)
		{
			resp.sendRedirect("home.jsp");
		}
		else {
			resp.sendRedirect("login.jsp");
		}
	}

}
