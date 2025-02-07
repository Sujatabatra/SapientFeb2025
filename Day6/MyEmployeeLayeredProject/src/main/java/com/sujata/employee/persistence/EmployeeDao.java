package com.sujata.employee.persistence;

import java.util.ArrayList;

import com.sujata.employee.entity.Employee;
import com.sujata.employee.exceptions.DuplicateIdException;

public interface EmployeeDao {

	ArrayList<Employee> getAllRecords();
	Employee getRecordById(int id);
	
	void saveRecord(Employee employee) throws DuplicateIdException;
}
