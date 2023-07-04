package com.dbhandler;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

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
	
	
	
	public static List fetchuserinfo()
	{
		String Driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="system";
		String sql="SELECT U_ID,USERNAME,EMAIL,PHONE,DATETIME FROM USERS";
		List ulist=new ArrayList();
		try {
			Class.forName(Driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				String temp=rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5);
				ulist.add(temp);
			}
			
		}catch(Exception e)
		{
			System.out.println("some error has occured"+e.getMessage());
			e.printStackTrace();
		}
		return ulist;
		
		
		
	}

}
