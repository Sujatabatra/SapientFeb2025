package com.sujata.objectio.serialize.caseone;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee extends Person {

	private String deptt;
	private String designation;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(int id, String name, int age, String deptt, String designation, double salary) {
		super(id, name, age);
		this.deptt = deptt;
		this.designation = designation;
		this.salary = salary;
	}

	public String getDeptt() {
		return deptt;
	}
	
	
	public void setDeptt(String deptt) {
		this.deptt = deptt;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString()+ " Employee [deptt=" + deptt + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	
	private void writeObject(ObjectOutputStream objectOutputStream) throws NotSerializableException {
		throw new NotSerializableException();
	}

	private void readObject(ObjectInputStream objectInputStream) throws NotSerializableException {
		throw new NotSerializableException();
		
	}
}
