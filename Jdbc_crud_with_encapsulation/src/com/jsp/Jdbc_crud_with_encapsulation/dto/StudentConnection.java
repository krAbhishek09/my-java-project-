package com.jsp.Jdbc_crud_with_encapsulation.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class StudentConnection {

	public static  Connection getStudentConnection() {
		
		
		try {
		/// Step - 1 Load/Register Driver
		
		Driver driver= new Driver();
		DriverManager.registerDriver(driver);
		
		
		// step 2- create connection :--
		
		String url= "jdbc:mySql:// localhost:3306/jdbc";
		String user="root";
		String pass="root";
		
		return DriverManager.getConnection(url,user,pass);
		
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		return null;
		
		
		
		
	}
}
