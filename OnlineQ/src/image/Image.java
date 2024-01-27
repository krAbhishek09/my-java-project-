package image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

import com.mysql.cj.protocol.Resultset;

public class Image {
	public static void main(String[] args) throws IOException {
//		 1st steps 
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "root";
//		String image_path =  "E:\\A\\64a32b33-77bb-4161-aa5e-f8548e728802.jpeg";
		String file_folder = "E:\\A\\";
//		String query="INSERT INTO image_table(image_data) VALUES(?)";
		String query = "Select image_data  from image_table where image_id=(?)";

//		2nd steps 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded Succesful");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		 3rd steps 

		try {
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is succesfully");
//			

//			?image store in byte form in databases;

//			FileInputStream fileInputStream=new FileInputStream(image_path);
//			byte[] imageData = new byte[fileInputStream.available()];
//			fileInputStream.read(imageData);
//			PreparedStatement preparedStatement=con.prepareStatement(query);
//			preparedStatement.setBytes(1,imageData);
//			int affectedRow= preparedStatement.executeUpdate();
//			
//			
//			if(affectedRow>0)
//			{
//				System.out.println("image inserted is successfully");
//			}
//			else {
//				System.out.println("image  not inserted is successfully");
//	
//			}

			PreparedStatement preparedStatement = con.prepareStatement(query);
			preparedStatement.setInt(1, 1);
			ResultSet resultset = preparedStatement.executeQuery();

			if (resultset.next()) {
//				System.out.println();
				
			}
			else {
				System.out.println("Not found !!!!!!!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
