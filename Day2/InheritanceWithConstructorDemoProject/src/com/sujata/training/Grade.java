package com.sujata.training;

public class Grade extends Marks {

	private double percentage;
	private String grade;
	
	public Grade() {
		System.out.println("Hi I am Grade class constructor");
	}
	
	
	public Grade(int rollNumber, String name, int marks1, int marks2, int marks3) {
		super(rollNumber, name, marks1, marks2, marks3);
	}


	public double getPercentage() {
		percentage=(getMarks1()+getMarks2()+getMarks3())/3;
		return percentage;
	}
	public String getGrade() {
		if(getPercentage()>75)
			grade="A Grade";
		else
			grade="B Grade";
		return grade;
	}
	
	public void display() {
		super.display();
		System.out.println("Percentage : "+getPercentage());
		System.out.println("Grade : "+getGrade());
	}
	
	
}
