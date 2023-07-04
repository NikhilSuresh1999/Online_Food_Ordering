package com.dbhandler;
import java.sql.*;

public class DataInjector {
	public static String addcustomer(String username,String fname,String lname,String email,String phone,String password,String address,int status)
	{
		String Driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="system";
		String sql="insert into users values(u_id.nextval,?,?,?,?,?,?,?,?,current_timestamp)";
		String regstatus="";
		
		try
		{
			Class.forName(Driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, username);
			ps.setString(2, fname);
			ps.setString(3, lname);
			ps.setString(4, email);
			ps.setString(5, phone);
			ps.setString(6, password);
			ps.setString(7, address);
			ps.setInt(8, status);
			
			ps.executeUpdate();
			regstatus="success";
			
		    
			
		}catch(Exception e)
		{
			System.out.println("error in insertion"+ e);
			e.printStackTrace();
			regstatus="fail";
		}
		return regstatus;
	}
	
	public static void addhotel(String hname,String address,String category)
	{
		String Driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="system";
		String sql="insert into hotels values(hotel_id.nextval,?,?,?)";
		
		try
		{
			Class.forName(Driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, hname);
			ps.setString(2, address);
			ps.setString(3, category);
			
			
			ps.executeUpdate();
		
	}catch(Exception e)
		{
		System.out.println("error in insertion"+ e);
		e.printStackTrace();
		
	}
	}
	

}
