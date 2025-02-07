package com.sujata.employee.presentation;

import java.util.ArrayList;

import com.sujata.employee.entity.Employee;
import com.sujata.employee.service.EmployeeService;
import com.sujata.employee.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("===========================");
		System.out.println("Employee Management System");
		System.out.println("============================");
		System.out.println("1. List All Employees");
		System.out.println("2. Search Employee By ID");
		System.out.println("3. Exit");

	}

	@Override
	public void performMenu(int choice) {
		switch (choice) {
		case 1:
			ArrayList<Employee> employeeList=employeeService.getAllEmployees();
			if(employeeList!=null && employeeList.size()!=0) {
				for(Employee employee:employeeList) {
					System.out.println(employee);
				}
			}
			else {
				System.out.println("No Empoyee exist right now");
			}
				
			break;
		case 2:
			System.out.println("This module is under development!");
			break;
		case 3:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
