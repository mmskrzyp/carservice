package edu.pk.carservice.exceptions;

public class LoginAlreadyTaken extends RegistrationException {
	
	public LoginAlreadyTaken(String login) {
		super("Login: " + login + " already exists in our database.");
	}
}
