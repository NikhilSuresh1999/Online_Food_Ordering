package com.customer;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dbhandler.DataInjector;

@WebServlet("/reg")
public class registerServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse resp)throws IOException
	{
		//int uid=Integer.parseInt(req.getParameter("uid"));
		String username=req.getParameter("uname");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String password=req.getParameter("password");
		String address=req.getParameter("address");
		int status=Integer.parseInt(req.getParameter("status"));
		//String date=req.getParameter("date");
		
		String result=DataInjector.addcustomer(username,fname,lname,email,phone,password,address,status);
		resp.sendRedirect("login.jsp");
		
	}
	
	
	

}
