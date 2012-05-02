package edu.pk.carservice.exceptions;

public class PeselAlreadyTaken extends RegistrationException {
	
	public PeselAlreadyTaken(String pesel) {
		super("Pesel: " + pesel + " is already used in our database");
	}
}
