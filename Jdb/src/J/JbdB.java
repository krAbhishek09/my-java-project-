package J;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.Statement;

public class JbdB {

	private static final String url = "jdbc:mysql://localhost:3306/xyz";
	private static final String username = "root";
	private static final String password = "root";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			while (true) {
				System.out.println();
				Scanner scanner = new Scanner(System.in);
				System.out.println("1. RegisterUser");
				System.out.println("2. LoginUser");
				System.out.println("3. to show users");
				System.out.println("0. Exit");
				System.out.print("Choose an option: ");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					getRegisterUser(connection, scanner);
					break;
				case 2:
					getLoginUser(connection, scanner);

					break;
				case 3:
//					showUsers(connection, scanner);
				default:
					System.out.println("Invalid choice. Try again.");
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void getRegisterUser(Connection connection, Scanner scanner) {

		System.out.print("Enter  id: ");
		int id = scanner.nextInt();

		System.out.print("Enter  name: ");
		String name = scanner.next();
		scanner.nextLine();
		System.out.print("Enter email: ");
		String email = scanner.next();
		System.out.println("Enter your password");
		String pass = scanner.next();

		String sql = "INSERT INTO users (id, name, email, password) " + "VALUES (" + id + ", '" + name + "', '" + email
				+ "', '" + pass + "')";
		// String sql = "SELECT user_id,id, name, email, password from users";

		try (Statement statement = connection.createStatement()) {
			int affectedRows = statement.executeUpdate(sql);
			// ResultSet resultSet = statement.executeQuery(sql);

			if (affectedRows > 0) {
				System.out.println("Register successful!");
			} else {
				System.out.println("Register failed.");
			}
//                

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	private static void showUsers(Connection connection, Scanner scanner) {
//		String sql = "SELECT user_id,id, name, email, password from users";
//
//		try (Statement statement = connection.createStatement()) {
//			ResultSet resultSet = statement.executeQuery(sql);
//
//			while (resultSet.next()) {
//				int user_id = resultSet.getInt("user_id");
//				int new_id = resultSet.getInt("id");
//				String new_name = resultSet.getString("name");
//				String new_email = resultSet.getString("email");
//				String new_password = resultSet.getString("password");
//
//				System.out.printf("| %-14d | %-15d | %-13s | %-20s | %-19s   |\n", user_id, new_id, new_name, new_email,
//						new_password);
//
//			}
//
//		} catch (SQLException e) {
//			System.out.println("error");
//			e.printStackTrace();
//		}
//
//	}

	private static void getLoginUser(Connection connection, Scanner scanner) {
		String query = "select email,password,user_id from users ";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(query);
			ResultSet resultSet = ps.executeQuery();
			if (resultSet.next()) {

				String email = resultSet.getString("email");
				String password = resultSet.getString("password");
				System.out.print("Enter userEmail: ");
				String userEmail = scanner.next();
				scanner.nextLine();
				System.out.print("Enter password: ");
				String pass = scanner.next();
				if (email.equals(userEmail) && password.equals(pass)) {
//					System.out.println("login successfully");
//					return true;
					int userId = resultSet.getInt("user_id");
					order(connection, scanner, userId);

				}

			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
//		return false;

	}

	public static void order(Connection connection, Scanner scanner, int userId) {
		int user_id=userId;
		System.out.println("What is your plan Today");
		System.out.println("1. Breakfast");
		System.out.println("2. JSpider");
		System.out.println("3. Outside");
		int ch = scanner.nextInt();
		switch (ch) {
		case 1:
			System.out.println("enter what you want");
			System.out.println("1. idli\n2. Dhosa\n3. chai\n4. ciggrate");
			char c;
			do {
				System.out.println("enter your choice (1/2/3/4)");
				int order1 = scanner.nextInt();
				String sql = "INSERT INTO orders (idli, dhosa, chai, ciggrate) " + "VALUES (" + order1 + ", '"
						+ order1 + "', '" + order1 + "', '" + order1 + "')";

				
				
//				String sql = "INSERT INTO users (id, name, email, password) " + "VALUES (" + id + ", '" + name + "', '" + email
//						+ "', '" + pass + "')";
//				start query
				try (Statement statement = connection.createStatement()) {
					int affectedRows = statement.executeUpdate(sql);
					// ResultSet resultSet = statement.executeQuery(sql);

					if (affectedRows > 0) {
						System.out.println("inserted. ");
					} else {
						System.out.println("failed.");
					}
//		                

				} catch (SQLException e) {
					e.printStackTrace();
				}
//				function call to order
				System.out.println("do you want more items(Y/N)");
				c = scanner.next().charAt(0);
			} while (c == 'y');

		}

	}
}
