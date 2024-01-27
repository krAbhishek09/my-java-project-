package com.jsp.jdbc_prepared_statement.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Laptop_connection {

	public static Connection getLaptopConnection() {
		Connection conn = null;
		/// step-1

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// step-2

			String url = "jdbc:mysql://localhost:3306/jdbc-1pm";
			String user = "root";
			String pass = "root";

			conn = DriverManager.getConnection(url, user, pass);

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return conn;
	}

	public static void main(String[] args) {
		getLaptopConnection();
	}

}
