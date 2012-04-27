package edu.pk.carservice.authentication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import edu.pk.carservice.entity.UserEntity;

public class DefaultUserEntityToSpringUserConverter implements UserEntityToSpringDetailsConverter {

	public UserDetails convertUserEntityToSpringUser(UserEntity userEntity) {
		String userName = userEntity.getLogin();
		String password = userEntity.getPassword();
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new GrantedAuthorityImpl("ROLE_USER")); // TODO roles in database 
		
		User springUser = new User(userName, password, true, true, true, true, authorities);
		return springUser;
	}
	

}
