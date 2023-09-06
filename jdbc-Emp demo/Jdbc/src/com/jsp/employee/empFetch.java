package com.jsp.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class empFetch {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement s = c.createStatement();
		
		boolean b = s.execute("select * from employee");//---->its return type is boolean
		
														/*--->DB to java it return true || we use execute
														 * else ---->it return from java to DB False
														 *----->to fetch data we use execute query
														 *-----> result inside the statement interface we have resiltset
														  *Resultset ----->executequery()
														  *			------>getResultSet()	
														  */
														  
														  
														
		if(b) {
			ResultSet rs= s.getResultSet();
			
			while(rs.next()) {
				int id     =   rs.getInt("eid"); 
				String ename = rs.getString(2);
				double Salary =rs.getDouble(3);
				String Job =   rs.getString("job");
				String Company=rs.getString(5);
				String Email = rs.getString(6);
				String Pass =  rs.getString(7);
				long number =  rs.getLong(8);
			
			
			System.out.println("id :"+id);
			System.out.println("name:"+ ename);
			System.out.println("Salary:"+Salary);
			System.out.println("Job:"+Job);
			System.out.println("Company:"+Company);
			System.out.println("Email:"+Email);
			System.out.println("Password:"+Pass);
			System.out.println("Phone number:"+number);
			
			System.out.println("<----------------------------------------->");
			}
		}else {
			System.out.println("No data has be retrived");
		}
		
		
		
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
 }
}
}