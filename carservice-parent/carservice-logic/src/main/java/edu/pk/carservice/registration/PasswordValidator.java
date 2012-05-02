package edu.pk.carservice.registration;

import edu.pk.carservice.entity.UserEntity;
import edu.pk.carservice.exceptions.PasswordValidationException;
import edu.pk.carservice.exceptions.RegistrationException;

public class PasswordValidator implements RegistrationValidator {

	public void processRegistrationEntry(UserEntity entity)
			throws RegistrationException {

		String password = entity.getPassword();

		boolean isLongEnough = password.length() >= 6;
		boolean containsNumbers = password.matches(".*[0-9].*");
		boolean containsLowercaseCharacters = password.matches(".*[a-z].*");
		boolean containsUppercaseCharacters = password.matches(".*[A-Z].*");

		if (!isLongEnough || !containsNumbers || !containsLowercaseCharacters
				|| !containsUppercaseCharacters)
			throw new PasswordValidationException();
	}

}
