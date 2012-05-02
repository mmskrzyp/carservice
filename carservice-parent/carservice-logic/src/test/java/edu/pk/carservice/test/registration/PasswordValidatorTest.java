package edu.pk.carservice.test.registration;

import org.junit.Test;

import edu.pk.carservice.entity.UserEntity;
import edu.pk.carservice.exceptions.PasswordValidationException;
import edu.pk.carservice.exceptions.RegistrationException;
import edu.pk.carservice.registration.PasswordValidator;

public class PasswordValidatorTest {
	
	private PasswordValidator validator;
	private UserEntity user;
	
	public PasswordValidatorTest(){
		validator = new PasswordValidator();
		user = new UserEntity();
	}

	@Test
	public void correctPasswordShouldNotThrowException() throws RegistrationException{
		user.setPassword("Correct1");
		validator.processRegistrationEntry(user);
	}
	
	@Test(expected = PasswordValidationException.class)
	public void emptyPasswordShouldThrowException() throws RegistrationException{
		user.setPassword("");
		validator.processRegistrationEntry(user);
	}
	
	@Test(expected = PasswordValidationException.class)
	public void tooShortPasswordShouldThrowException() throws RegistrationException{
		user.setPassword("Sho1");
		validator.processRegistrationEntry(user);
	}
	
	@Test(expected = PasswordValidationException.class)
	public void purelyLowercaseCharactersPasswordShouldThrowException() throws RegistrationException{
		user.setPassword("password1");
		validator.processRegistrationEntry(user);
	}
	
	@Test(expected = PasswordValidationException.class)
	public void purelyUppercaseCharactersPasswordShouldThrowException() throws RegistrationException{
		user.setPassword("PASSWORD1");
		validator.processRegistrationEntry(user);
	}
	
	@Test(expected = PasswordValidationException.class)
	public void purelyAlphabeticPasswordShouldThrowException() throws RegistrationException{
		user.setPassword("Password");
		validator.processRegistrationEntry(user);
	}
}
