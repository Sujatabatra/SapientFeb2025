package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySecondJdbcDemoClass {
    public static void main(String[] args) {

    	Scanner scanner=new Scanner(System.in);
    	Statement statement=null;
    	try(
    			Connection connection=
    			DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sapient",
    					"root", 
    					"sujata");
    			) {
//          1. Connect
//        	1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Enter Employee ID : ");
			int id=scanner.nextInt();
			System.out.println("Enter Employee Name : ");
			String name=scanner.next();
			System.out.println("Enter Employee Designation : ");
			String desig=scanner.next();
			System.out.println("Enter Employee Department : ");
			String deptt=scanner.next();
			System.out.println("Enter Employee Salary : ");
			double sal=scanner.nextDouble();
			
//			2. Query
			statement=connection.createStatement();
			
			//DML Statement : insert, delete, update statement : executeUpdate()	
			String query="INSERT INTO EMPLOYEE VALUES("+id+",'"+name+"','"+desig+"','"+deptt+"',"+sal+")";
			int rows=statement.executeUpdate(query);
			
//			3. Process Result
			if(rows>0)
				System.out.println("Employee Added!");
    	} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Employee Not Added!");
		}
    	
    }
}
