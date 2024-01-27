package com.jsp.jdbc_01_registration.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class RegistrationConnection {
	
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql//:localhost:3306/jdbc";
			String username="root";
			String pass="root";
			return DriverManager.getConnection(url,username,pass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
