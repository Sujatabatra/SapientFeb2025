package com.sujata.employee.service;

import java.util.ArrayList;

import com.sujata.employee.entity.Employee;
import com.sujata.employee.entity.Payslip;
import com.sujata.employee.exceptions.DuplicateIdException;
import com.sujata.employee.exceptions.RecordNotFoundException;
import com.sujata.employee.persistence.EmployeeDao;
import com.sujata.employee.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public ArrayList<Employee> getAllEmployees() {
		return employeeDao.getAllRecords();
	}

	@Override
	public Employee getEmployeeById(int employeeId)throws RecordNotFoundException {
		Employee employee=employeeDao.getRecordById(employeeId);
		if(employee==null)
			throw new RecordNotFoundException();
		return employee;
	}

	@Override
	public void insertEmployee(Employee employee) throws DuplicateIdException {
		employeeDao.saveRecord(employee);
		
	}

	@Override
	public Payslip generatePayslip(int employeeId) throws RecordNotFoundException {
		Payslip payslip=new Payslip();
		try {
			Employee employee=getEmployeeById(employeeId);
			payslip.setEmployee(employee);
			payslip.setAllowances(employee.getEmpSalary()*.20);
			payslip.setDeductions(employee.getEmpSalary()*.12);
			payslip.setNetSalary(employee.getEmpSalary()+payslip.getAllowances()-payslip.getDeductions());
		}
		catch(RecordNotFoundException recordNotFoundException) {
			throw recordNotFoundException;
		}
		return payslip;
	}

}
