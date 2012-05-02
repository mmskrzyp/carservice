package edu.pk.carservice.exceptions;

public class PasswordValidationException extends RegistrationException {

	public PasswordValidationException() {
		super("Password should be longer than 5 characters "
				+ "and also contain numbers, "
				+ "uppercase and lowercase characters");
	}

}
