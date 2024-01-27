package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateR {
	public static void main(String[] args) throws Exception {
//		String column_name="RawAn";
		String city1="pine";
		String email=" Kunal@gmailcom";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db" ,"root ","root");
PreparedStatement ps=		con.prepareStatement("update register  set city =?,password=?, where email=?");
//		ps.setString(1, column_name);
		ps.setString(1, city1);	
		ps.setString(2, email);
		
	int count=	ps.executeUpdate();
	if (count>0) {
		System.out.println("Updated");
		
	}
	else {
		System.out.println("not up");
	}
	}

}
