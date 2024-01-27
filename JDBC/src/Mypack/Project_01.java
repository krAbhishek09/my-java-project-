package Mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class Project_01 {
	
		
		public static void main(String[] args) {
			
//			try {
////				Class.forName("com.mysql.cj.jdbc.Driver");
//				
//				
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			try {
				Driver d=new Driver();
				DriverManager.registerDriver(d);
				String url="jdbc:mysql://localhost:3306/jdbc";
				String user="root";
				String pass="root";
				
				Connection conn=DriverManager.getConnection(url,user,pass);
				java.sql.Statement statement=conn.createStatement();
				
				
//				String insertQuery="insert into emplooye values(124,'shivam','shivam@gmail.com',84884545)";
//				statement.execute(insertQuery);
//				String deleteQuery="delete from emplooye where id="+121;
//				statement.executeUpdate(deleteQuery);
//				
//				String updateQuery="update emplooye set name='y',email='x@gamil.com' where id="+124;
//				statement.executeUpdate(updateQuery);
				
				ResultSet res=statement.executeQuery("select * from emplooye");
//				res.next();
				if(res.next())
					System.out.println(res.getInt("id"));
				System.out.println(res.next());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	
	

}
