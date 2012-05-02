package edu.pk.carservice.registration;

import edu.pk.carservice.entity.UserEntity;
import edu.pk.carservice.exceptions.RegistrationException;

public interface RegistrationValidator {
	
	public void processRegistrationEntry(UserEntity entity) throws RegistrationException;
}
