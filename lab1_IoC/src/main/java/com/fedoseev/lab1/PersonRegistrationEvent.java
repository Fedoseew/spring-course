package com.fedoseev.lab1;

import org.springframework.context.ApplicationEvent;

public class PersonRegistrationEvent extends ApplicationEvent {

	private static final long serialVersionUID = 2545745837098118673L;
	
	private Person person;

	public PersonRegistrationEvent(Person person) {
		super(person);
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
