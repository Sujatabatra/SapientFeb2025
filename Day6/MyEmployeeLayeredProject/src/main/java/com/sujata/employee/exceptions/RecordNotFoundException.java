package com.sujata.employee.exceptions;

public class RecordNotFoundException extends Exception {

	public RecordNotFoundException(String message) {
		super(message);
	}
	
	public RecordNotFoundException() {
		super();
	}
}
