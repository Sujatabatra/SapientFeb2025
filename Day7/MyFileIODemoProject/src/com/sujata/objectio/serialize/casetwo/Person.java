package com.sujata.objectio.serialize.casetwo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private int age;
	transient private Address address;

	public Person() {

	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	
	public Person(int id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}


	private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
		
		objectInputStream.defaultReadObject();
		address=new Address((int)objectInputStream.readObject(),
				(String)objectInputStream.readObject(),
				(String)objectInputStream.readObject(),
				(String)objectInputStream.readObject(),
				(String)objectInputStream.readObject());
	}
	
	private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
		objectOutputStream.defaultWriteObject();
		objectOutputStream.writeObject(address.getHouseNumber());
		objectOutputStream.writeObject(address.getStreetName());
		objectOutputStream.writeObject(address.getCity());
		objectOutputStream.writeObject(address.getState());
		objectOutputStream.writeObject(address.getPinCode());
	}

}
