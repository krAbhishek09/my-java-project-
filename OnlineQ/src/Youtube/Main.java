package Youtube;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Main {
	private static String salary;

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String pass = "root";
		String query = "Select * from employee";

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
			ResultSet rs = stm.executeQuery(query);
//			System.out.println("Connection Stablish Successfuly");
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String job_title = rs.getString("job_title");
				Double salary = rs.getDouble("Salary");

				System.out.println();
				System.out.println("=============================");
				System.out.println("ID : " + id);
				System.out.println("name: " + name);
				System.out.println("job_t: " + job_title);
				System.out.println("salary: " + salary);
			}
			
			rs.close();
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
