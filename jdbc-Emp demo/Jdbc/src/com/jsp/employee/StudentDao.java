package com.jsp.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {

	
		static String driverClass = "com.mysql.cj.jdbc.Driver";
		static String url = "jdbc:mysql://localhost:3306/employee";
		static String user = "root";
		static String pass = "root";
		
		
		public static void main(String[] args) {
		
	}
		
		public void insert(int id,String ename,double Salary,String Job,String Company,String Email,String Pass,long number)throws ClassNotFoundException,SQLException {
			
			Class.forName(driverClass);
			Connection c = DriverManager.getConnection(url,user,pass);
			
			PreparedStatement ps = c.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2,ename);
			ps.setDouble(3,Salary);
			ps.setString(4,Job);
			ps.setString(5,Company);
			ps.setString(6,Email);
			ps.setString(7,Pass);
			ps.setLong(8,number);
			
			ps.executeUpdate();
		
			c.close();
			
		}
		
		public void fetchStudentByName(String ename) throws SQLException, ClassNotFoundException {
			Class.forName(driverClass);
			Connection c = DriverManager.getConnection(url,user,pass);
			
			PreparedStatement ps = c.prepareStatement("Select * from employee where ename = ?");
			ps.setString(1,ename);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id     =   rs.getInt("eid"); 
				String name = rs.getString(2);
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
			
			c.close();
		}
		
		
		
		public void fetchAll()throws SQLException,ClassNotFoundException{
			Class.forName(driverClass);
			Connection c = DriverManager.getConnection(url,user,pass);
			
			Statement s = c.createStatement();// in create statement will always be a no argument 
			
			 ResultSet rs = s.executeQuery("select * from employee");
			 
			 while(rs.next()) {
					int id     =   rs.getInt("eid"); 
					String name = rs.getString(2);
					double Salary =rs.getDouble(3);
					String Job =   rs.getString("job");
					String Company=rs.getString(5);
					String Email = rs.getString(6);
					String Pass =  rs.getString(7);
					long number =  rs.getLong(8);
				
				
				System.out.println("id :"+id);
				System.out.println("name:"+ name);
				System.out.println("Salary:"+Salary);
				System.out.println("Job:"+Job);
				System.out.println("Company:"+Company);
				System.out.println("Email:"+Email);
				System.out.println("Password:"+Pass);
				System.out.println("Phone number:"+number);
				
				System.out.println("<----------------------------------------->");
				}
				
				c.close();
			}
			
			 
			 
		}
		
		
		


