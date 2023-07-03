package com.dbhandler;
import java.sql.*;

public class fetchdata {
	public static String fetchpassword(String uname)
	{
		String Driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="system";
		String sql="select password from users where username=?";
		String result="";
		
		try {
			Class.forName(Driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, uname);
			ResultSet rs=ps.executeQuery();
			rs.next();
			result=rs.getString(1);
			
			
		}catch(Exception e)
		{
			System.out.println("Error in login"+e);
			e.printStackTrace();
		}
		return result;
	
	}

}
