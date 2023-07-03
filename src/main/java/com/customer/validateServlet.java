package com.customer;
import com.dbhandler.fetchdata;
public class validateServlet {
	public static boolean isvalid(String uname,String password)
	{
		String result=fetchdata.fetchpassword(uname);
		if(result.equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
