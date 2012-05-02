package edu.pk.carservice.exceptions;

public class EmailAlreadyTaken extends RegistrationException {
	
	public EmailAlreadyTaken(String email) {
		super("Email: " + email + " is already used in our database.");
	}
}
