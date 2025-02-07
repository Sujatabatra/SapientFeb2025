package com.sujata.employee.persistence;

import java.util.ArrayList;

import com.sujata.employee.entity.Employee;

public interface EmployeeDao {

	ArrayList<Employee> getAllRecords();
}
