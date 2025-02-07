package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySecondJdbcDemoWithPreparedStatementClass {
    public static void main(String[] args) {

    	Scanner scanner=new Scanner(System.in);
    	PreparedStatement preparedStatement=null;
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
			preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, desig);
			preparedStatement.setString(4, deptt);
			preparedStatement.setDouble(5, sal);
			
			//DML Statement : insert, delete, update statement : executeUpdate()	
			
			int rows=preparedStatement.executeUpdate();
			
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
