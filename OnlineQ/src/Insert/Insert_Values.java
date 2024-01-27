package Insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_Values {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String pass = "root";
//		String query = "INSERT INTO employee(id,name,job_title,salary)values(543,'Raushan','Web Dev',8888888); ";
		String query="DELETE from employee where id=1";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded..");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection(url, username, pass);

			Statement stm = con.createStatement();
			int rose = stm.executeUpdate(query);
			if (rose > 0) {
//				System.out.println("Data stored is succesfully");
				System.out.println("Data succesfully delete");


			} else {
				System.out.println("Not a storded");
			}

			stm.close();
			stm.close();
			con.close();
			System.out.println();
			System.out.println("Connection close Succesfully ");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
