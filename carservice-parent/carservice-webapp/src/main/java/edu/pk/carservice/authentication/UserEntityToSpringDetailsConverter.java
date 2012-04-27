package edu.pk.carservice.authentication;

import org.springframework.security.core.userdetails.UserDetails;

import edu.pk.carservice.entity.UserEntity;

public interface UserEntityToSpringDetailsConverter {
	public UserDetails convertUserEntityToSpringUser(UserEntity userEntity);
}
