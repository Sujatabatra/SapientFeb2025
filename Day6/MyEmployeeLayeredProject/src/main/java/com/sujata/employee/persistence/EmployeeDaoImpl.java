package com.sujata.employee.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.sujata.employee.entity.Employee;
import com.sujata.employee.exceptions.DuplicateIdException;

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

	@Override
	public Employee getRecordById(int id) {
		PreparedStatement preparedStatement=null;
    	Employee employee=null;
		try(
    			Connection connection=
    			DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sapient",
    					"root", 
    					"sujata");
    			) {

			Class.forName("com.mysql.cj.jdbc.Driver");
			preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE ID=?");
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet= preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				int eid=resultSet.getInt("ID");
				String name=resultSet.getString("NAME");
				String desig=resultSet.getString("DESIGNATION");
				String deptt=resultSet.getString("DEPARTMENT");
				double sal=resultSet.getDouble("SALARY");
				
				employee=new Employee(eid,name,desig,deptt,sal);
				
			}
			
    	} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public void saveRecord(Employee employee) throws DuplicateIdException {
		PreparedStatement preparedStatement=null;
    	try(
    			Connection connection=
    			DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sapient",
    					"root", 
    					"sujata");
    			) {
			Class.forName("com.mysql.cj.jdbc.Driver");

			preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");
			
			preparedStatement.setInt(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpName());
			preparedStatement.setString(3, employee.getDesignation());
			preparedStatement.setString(4, employee.getDepartment());
			preparedStatement.setDouble(5, employee.getEmpSalary());
			
			int rows=preparedStatement.executeUpdate();
			
    	} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			throw new DuplicateIdException();
		}

		
	}

}
