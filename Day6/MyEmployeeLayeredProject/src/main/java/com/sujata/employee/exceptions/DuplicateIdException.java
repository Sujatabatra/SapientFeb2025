package com.sujata.employee.exceptions;

public class DuplicateIdException extends Exception {

	public DuplicateIdException(String message) {
		super(message);
	}
	
	public DuplicateIdException() {
		super();
	}
}
