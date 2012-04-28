package edu.pk.carservice.dao;

import edu.pk.carservice.entity.UserEntity;

public interface UsersDAO {
	
	public UserEntity getUserByUsername(String username);
}
