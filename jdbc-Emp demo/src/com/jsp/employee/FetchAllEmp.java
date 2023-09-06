package com.jsp.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchAllEmp {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			Statement s = c.createStatement();
			
		ResultSet rs	= s.executeQuery("Select ename,salary from Employee");
		
		while(rs.next()){
			
			String name= rs.getString(1);
			double Salary = rs.getDouble(2);
			
			System.out.println(name);
			System.out.println(Salary);
			
		}
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
