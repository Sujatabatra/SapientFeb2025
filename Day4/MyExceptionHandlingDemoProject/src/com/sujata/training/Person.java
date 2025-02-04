package com.sujata.training;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		super();
	}
	public Person(String name, int age)throws AgeCheckedException {
		this.name = name;
		if(age<=0 || age>60)
			throw new AgeCheckedException("age cannot be greater than 60 and less than 1");
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<=0 || age>60)
			throw new AgeUncheckedException("Invalid age, age must be between 1 to 60");
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
