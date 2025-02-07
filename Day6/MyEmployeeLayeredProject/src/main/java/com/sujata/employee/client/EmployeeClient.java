package com.sujata.employee.client;

import java.util.Scanner;

import com.sujata.employee.presentation.EmployeePresentation;
import com.sujata.employee.presentation.EmployeePresentationImpl;

public class EmployeeClient {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    	EmployeePresentation employeePresentation=new EmployeePresentationImpl();
        while(true) {
        	employeePresentation.showMenu();
        	System.out.println("Enter Choice : ");
        	employeePresentation.performMenu(scanner.nextInt());
        }
    }
}
