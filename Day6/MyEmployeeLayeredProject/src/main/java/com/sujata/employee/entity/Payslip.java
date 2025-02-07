package com.sujata.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payslip {

	private Employee employee;
	private double allowances;
	private double deductions;
	private double netSalary;
	
}
