package com.jsp.jdbc_prepared_statement.controller;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.jsp.jdbc_prepared_statement.connection.Laptop_connection;
import com.jsp.jdbc_prepared_statement.entity.Laptop;

public class Laptop_contoller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Connection connection = Laptop_connection.getLaptopConnection();
		while (true) {
			System.out.println("1. Insert");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("Enter your Choice");
			int key = sc.nextInt();
			switch (key) {
			case 1: {

				System.out.println("Enter your id");
				int id = sc.nextInt();

				System.out.println("Enter your name");
				String name = sc.next();

				System.out.println("Enter your color");
				String color = sc.next();

				System.out.println("Enter your price");
				Double price = sc.nextDouble();

				System.out.println("Enter your ram");
				String ram = sc.next();

				Laptop laptop = new Laptop(id, name, color, price, ram);

				String InsertQuery = "insert into laptop values(?,?,?,?,?)";

				try {
					PreparedStatement ps = connection.prepareStatement(InsertQuery);

					ps.setInt(1, laptop.getId());
					ps.setString(2, laptop.getName());
					ps.setString(3, laptop.getColor());
					ps.setDouble(4, laptop.getPrice());
					ps.setString(5, laptop.getRam());

					ps.execute();
					System.out.println("Data__ Stored");

				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			}

			case 2: {

				System.out.println("what you want to upadate");
				System.out.println("1.name\n2.Color\n3.price\n4.ram");
				int choice = sc.nextInt();
				switch (choice) {
				case 1: {
					System.out.println("Enter your id");
					int id = sc.nextInt();
					System.out.println("Enter your name");
					String name = sc.next();
					String updateNameQuery = "update laptop set name=? where id=?";

					try {
						connection = Laptop_connection.getLaptopConnection();
						PreparedStatement ps = connection.prepareStatement(updateNameQuery);
						ps.setInt(2, id);
						ps.setString(1, name);
						int a = ps.executeUpdate();

						if (a != 0) {
							System.out.println("Data update");
						} else {
							System.out.println("not update");
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;

				}

				case 2: {
					System.out.println("Enter your id");
					int id = sc.nextInt();
					System.out.println("Enter your color");
					String color = sc.next();
					String updateColorQuery = "update laptop set color=? where id=?";

					try {
						connection = Laptop_connection.getLaptopConnection();
						PreparedStatement ps = connection.prepareStatement(updateColorQuery);
						ps.setInt(2, id);
						ps.setString(1, color);
						int a = ps.executeUpdate();

						if (a != 0) {
							System.out.println("Data upadte");
						} else {
							System.out.println("not update");
						}
					} catch (SQLException e) {

						e.printStackTrace();
					}
					break;

				}
				case 3: {
					System.out.println("Enter your id");
					int id = sc.nextInt();
					System.out.println("Enter your price");
					String price = sc.next();
					String updatePriceQuery = "update laptop set price=? where id=?";

					try {
						connection = Laptop_connection.getLaptopConnection();
						PreparedStatement ps = connection.prepareStatement(updatePriceQuery);
						ps.setInt(2, id);
						ps.setString(1, price);
						int a = ps.executeUpdate();

						if (a != 0) {
							System.out.println("Data upadte");
						} else {
							System.out.println("not update");
						}
					} catch (SQLException e) {

						e.printStackTrace();
					}
					break;

				}
				case 4: {
					System.out.println("Enter your id");
					int id = sc.nextInt();
					System.out.println("Enter your ram");
					String ram = sc.next();
					String updateRamQuery = "update laptop set ram=? where id=?";

					try {
						connection = Laptop_connection.getLaptopConnection();
						PreparedStatement ps = connection.prepareStatement(updateRamQuery);
						ps.setInt(2, id);
						ps.setString(1, ram);
						int a = ps.executeUpdate();

						if (a != 0) {
							System.out.println("Data upadte");
						} else {
							System.out.println("not update");
						}
					} catch (SQLException e) {

						e.printStackTrace();
					}
					break;

				}

				}

			}
				break;

			case 3: {
				connection = Laptop_connection.getLaptopConnection();

				try {
					System.out.println("Enter id for delete ");
					int id = sc.nextInt();

					PreparedStatement preparedStatement = connection.prepareStatement("delete from laptop where id=?");
					preparedStatement.setInt(1, id);
					int res = preparedStatement.executeUpdate();
					if (res == 1) {
						System.out.println("succcess");
					} else {
						System.out.println("failed");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 4: {
				String selectQuery = "select * from laptop";
				connection = Laptop_connection.getLaptopConnection();

				PreparedStatement preparedStatement;
				try {
					preparedStatement = connection.prepareStatement(selectQuery);
					ResultSet resultset = preparedStatement.executeQuery();
					while (resultset.next()) {
						int id = resultset.getInt("id");
						String name = resultset.getString("name");
						String color = resultset.getString("color");
						Double price = resultset.getDouble("price");
						String ram = resultset.getString("ram");

						Laptop laptop = new Laptop(id, name, color, price, ram);
						System.out.println(laptop);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			}
		}

	}

}
