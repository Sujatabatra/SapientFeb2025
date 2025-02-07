package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJdbcDemoClass {
    public static void main(String[] args) {

    	Connection connection=null;
    	Statement statement=null;
    	try {
//          1. Connect
//        	1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
//			1.2 Connect to DataBase
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sapient", "root", "sujata");
			
//			2. Query
			statement=connection.createStatement();
			
			//DQL Statement : select statement : executeQuery()	
			ResultSet resultSet= statement.executeQuery("SELECT * FROM EMPLOYEE");
			
//			3. Process Result
			while(resultSet.next()) {
				int id=resultSet.getInt("ID");
				String name=resultSet.getString("NAME");
				String desig=resultSet.getString("DESIGNATION");
				String deptt=resultSet.getString("DEPARTMENT");
				double sal=resultSet.getDouble("SALARY");
				
				System.out.println(id+"  "+name+"  "+desig+"  "+deptt+"  "+sal);
			}
    	} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	finally {
    		try {
//    			4. Close
				connection.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
    	}
    }
}
