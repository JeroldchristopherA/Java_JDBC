package com.jsp.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpUpdate {
 public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 
	 System.out.println("updatin the email");
	 String email= s.next();
	 
	 
	 
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		PreparedStatement pc = c1.prepareStatement("update set ename where email= ?");
		pc.setString(1, email);
		
		pc.executeUpdate();
		
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
		
}
}
