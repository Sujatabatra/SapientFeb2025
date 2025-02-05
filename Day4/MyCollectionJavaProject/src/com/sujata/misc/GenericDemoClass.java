package com.sujata.misc;

class InputInteger{
	private Integer value1;

	public Integer getValue1() {
		return value1;
	}

	public void setValue1(Integer value1) {
		this.value1 = value1;
	}
	
}

class InputDouble{
	private Double value1;

	public Double getValue1() {
		return value1;
	}

	public void setValue1(Double value1) {
		this.value1 = value1;
	}
	
}

class InputString{
	private String value1;

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}
	
	
}

class GenericInput<T>{
	private T value1;

	public T getValue1() {
		return value1;
	}
	public void setValue1(T value1) {
		this.value1 = value1;
	}
	
	
}
public class GenericDemoClass {

	public static void main(String[] args) {
		GenericInput<Integer> genericInput=new GenericInput<Integer>();
		
		genericInput.setValue1(10);
		
		GenericInput<String> genericInput2=new GenericInput<>();
		
		genericInput2.setValue1("Sujata");

		GenericInput<Person> genericInput3=new GenericInput<>();
		genericInput3.setValue1(new Person(1, "AAAA"));
		System.out.println(genericInput3.getValue1());
	}

}
