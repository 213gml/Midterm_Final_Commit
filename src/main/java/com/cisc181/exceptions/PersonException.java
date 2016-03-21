package com.cisc181.exceptions;

import com.cisc181.core.Person;

public class PersonException extends Exception {
	
	private Person Person;
	private String errorMessage;

	public PersonException(Person person, String errorMessage) {
		super();
		this.Person = person;
		this.errorMessage = errorMessage;
	}
	
	
	
	

}
