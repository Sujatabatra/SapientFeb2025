package com.sujata.employee.service;

import java.util.ArrayList;

import com.sujata.employee.entity.Employee;
import com.sujata.employee.entity.Payslip;
import com.sujata.employee.exceptions.DuplicateIdException;
import com.sujata.employee.exceptions.RecordNotFoundException;

public interface EmployeeService {

	ArrayList<Employee> getAllEmployees();
	
	Employee getEmployeeById(int employeeId)throws RecordNotFoundException;
	
	void insertEmployee(Employee employee)throws DuplicateIdException;
	
	Payslip generatePayslip(int employeeId)throws RecordNotFoundException;
}
