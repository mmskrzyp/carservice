package edu.pk.carservice.authentication;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import edu.pk.carservice.dao.UsersDAO;
import edu.pk.carservice.entity.UserEntity;

public class UserDetailsServiceImpl implements UserDetailsService {

	private UsersDAO usersSessionBean;
	private UserEntityToSpringDetailsConverter userToSpringConverter;
	
	public void setUserSessionBean(UsersDAO userSessionBean) {
		this.usersSessionBean = userSessionBean;
	}
	
	public void setUserToSpringConverter(UserEntityToSpringDetailsConverter userToSpringConverter) {
		this.userToSpringConverter = userToSpringConverter;
	}
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
		UserEntity user = usersSessionBean.getUserByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("Username not found in database: " + username);
		}
		return userToSpringConverter.convertUserEntityToSpringUser(user);
	}

}
