package com.jsp.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDelete {
	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("enter the values to delete");
//		String kk = s.next();
//		
//	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement p = c.prepareStatement("delete ename from employee=? where ename=jerry");
			
			
			
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}