package com.jsp.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class Employee {
	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter the employee id");
	int eid = s.nextInt();
	
	System.out.println("Enter the employee Name");
	String ename= s.next();
	
	System.out.println("Enter the employee Salary");
	double salary = s.nextDouble();
	
	System.out.println("Enter the employee Job");
	String job = s.next();
	
	System.out.println("Enter the employee Company Name");
	String company_name= s.next();
	
	System.out.println("Enter the employee Email address/n");
	String email = s.next();
	
	System.out.println("Enter the employee Password  /n");
	String password = s.next();
	
	System.out.println("Enter the employee Phone number");
	int phone = s.nextInt();
	
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		PreparedStatement pc = c1.prepareStatement("insert into Employee values(?,?,?,?,?,?,?,?)");
		
		pc.setInt(1, eid);
		pc.setString(2,ename);
		pc.setDouble(3,salary);
		pc.setString(4,job);
		pc.setString(5,company_name);
		pc.setString(6,email);
		pc.setString(7,password);
		pc.setInt(8,phone);
		
		boolean b = pc.execute();
		
		System.out.println(b);
		
		System.out.println("Values upsdated");
		
	} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
					System.out.println("Values not yet upsdated");
	}
	
	
	
	}
	
	/*when we are in confusion we go for execute()
	 * when go for select type of query we use executeQuery()
	 * when we want to do insert , update ,delete we use executeUpdate()
	 * When we want to execute in batch we use executeBatch()
	 * */
	
	

}
