package com.sujata.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private int empId;
	private String empName;
	private String designation;
	private String department;
	private double empSalary;
}
