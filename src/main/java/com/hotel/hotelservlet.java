package com.hotel;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dbhandler.DataInjector;

@WebServlet("/addh")
public class hotelservlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse resp)throws IOException
	{
		String hname=req.getParameter("hname");
		String address=req.getParameter("address");
		String category=req.getParameter("category");
		
		DataInjector.addhotel(hname,address,category);
		
		resp.sendRedirect("admin.jsp");
	}

}
