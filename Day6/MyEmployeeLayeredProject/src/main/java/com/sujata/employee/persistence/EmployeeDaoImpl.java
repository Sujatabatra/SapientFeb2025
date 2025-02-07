package com.sujata.employee.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.sujata.employee.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public ArrayList<Employee> getAllRecords() {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		PreparedStatement preparedStatement=null;
    	try(
    			Connection connection=
    			DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sapient",
    					"root", 
    					"sujata");
    			) {

			Class.forName("com.mysql.cj.jdbc.Driver");
			preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE");	
			ResultSet resultSet= preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int id=resultSet.getInt("ID");
				String name=resultSet.getString("NAME");
				String desig=resultSet.getString("DESIGNATION");
				String deptt=resultSet.getString("DEPARTMENT");
				double sal=resultSet.getDouble("SALARY");
				Employee employee=new Employee(id,name,desig,deptt,sal);
				empList.add(employee);
			}
			return empList;
    	} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
