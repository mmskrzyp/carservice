package edu.pk.carservice.dao;

import edu.pk.carservice.entity.UserEntity;
import edu.pk.carservice.exceptions.RegistrationException;

public interface UsersDAO {
	
	public void registerUser(UserEntity toRegister) throws RegistrationException;
	public UserEntity getUserByUsername(String username);
}
