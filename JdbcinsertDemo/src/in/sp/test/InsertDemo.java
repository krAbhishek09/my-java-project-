package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDemo {
	public static void main(String[] args) throws Exception {
//	String	name="kunal";
//	String email="Kunal@gmailcom";
//	String pass1="Kunal";
//	String pass="Kunal@gmailcom";
//	String gender="male";
//	String city="muz";
//		
		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
//		PreparedStatement ps=con.prepareStatement("insert into register values('"+name+"','"+email+"','"+pass1+"','"+gender+"','"+city+"')");
		PreparedStatement ps=con.prepareStatement("insert into register values('Abhishekkr', ' Abhishekbhagat6654@gmail.com','Abhi123','male','muzffarpur')");
																
		
		int i= ps.executeUpdate();
		if (i>0) {
			System.out.println("Success");
			
		}
		else
		{
			System.out.println("not success");
		}
	}

}
