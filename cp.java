package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class cp {
	
	static Connection con;
	
	public static Connection createC()
	{
		//load the driver
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 //create connection
			 String user = "root";
			 String password = "pass@123";
			 String url = "jdbc:mysql://localhost:3306/student_manage";
			 
			 con = DriverManager.getConnection( url,user,password);
		} 
		 catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		 return con;
	}

}
