package com.sujata.employee.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import com.sujata.employee.entity.Employee;
import com.sujata.employee.entity.Payslip;
import com.sujata.employee.exceptions.DuplicateIdException;
import com.sujata.employee.exceptions.RecordNotFoundException;
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
		System.out.println("3. Add New Employee");
		System.out.println("4. Generate Payslip");
		System.out.println("5. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
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
			int id=0;
			try {
			System.out.println("Enter Employee Id to be searched for : ");
			id=scanner.nextInt();
			Employee employee=employeeService.getEmployeeById(id);
			System.out.println(employee);
			}
			catch(RecordNotFoundException recordNotFoundException) {
				System.out.println("No Employee with id "+id+" exist");
			}
			break;
		case 3:
			try {
			System.out.println("Enter Employee ID : ");
			int eid=scanner.nextInt();
			System.out.println("Enter Employee Name : ");
			String name=scanner.next();
			System.out.println("Enter Employee Designation : ");
			String desig=scanner.next();
			System.out.println("Enter Employee Department : ");
			String deptt=scanner.next();
			System.out.println("Enter Employee Salary : ");
			double sal=scanner.nextDouble();
			
			employeeService.insertEmployee(new Employee(eid, name, desig, deptt, sal));
			System.out.println("Employee Added");
			}
			catch(DuplicateIdException duplicateIdException) {
				System.out.println("Kindly enter Unique ID to add new Employee");
			}
			break;
		case 4:
			int employeeId=0;
			try {
			System.out.println("Enter Employee ID for payslip Generation : ");
			employeeId=scanner.nextInt();
			Payslip payslip=employeeService.generatePayslip(employeeId);
			System.out.println(payslip);
			}
			catch(RecordNotFoundException recordNotFoundException) {
				System.out.println("Employee with id "+employeeId+" does not exist");
			}
			break;
		case 5:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
