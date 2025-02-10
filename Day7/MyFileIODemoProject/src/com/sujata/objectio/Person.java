package com.sujata.objectio;

import java.io.Serializable;

public class Person implements Serializable {

	
	private static final long serialVersionUID = -8529173058354491693L;
	
	private int id;
	private String name;
	private int age;

	public Person() {

	}

	public Person(int id,String name) {
		this.name=name;
		this.id=id;
		this.age=20;
	}
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
