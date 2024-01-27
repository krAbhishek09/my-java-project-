package com.jsp.studentcontroller.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.jsp.Jdbc_crud_with_encapsulation.dto.StudentConnection;
import com.mysql.cj.xdevapi.Statement;



public class StudentController {
	
	public static void main(String[] args) {
		
		Connection conn=StudentConnection.getStudentConnection();
		
		
		
		
		
		
		
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1 for insert data ");
		System.out.println("Enter 2 for insert data ");
		System.out.println("Enter 3 for insert data ");
		System.out.println("Enter 4 for insert data ");
		System.out.println("Enter your choice  ");
		int choice =sc.nextInt();
		switch (choice) {
		case 1: 
			try {
				java.sql.Statement statement=conn.createStatement();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;

		default:
			System.out.println("Invaild choice :--");
		}
	}
	
	
	


}
