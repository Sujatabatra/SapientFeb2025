package com.sujata.training;

import com.sujata.demo.Student;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student();
		student.input(101, "AAA");
		student.display();
		
		Marks marks=new Marks();
		marks.input(102, "BBBB", 78, 88, 89);
		marks.display();
		
		Grade grade=new Grade();
		grade.input(103, "CCC", 90, 78, 56);
		grade.display();

	}

}
