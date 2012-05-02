package edu.pk.carservice.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import edu.pk.carservice.dao.UsersDAO;
import edu.pk.carservice.entity.UserEntity;
import edu.pk.carservice.exceptions.RegistrationException;
import edu.pk.carservice.registration.RegistrationValidator;

public class UserSessionBean extends HibernateDaoSupport implements UsersDAO {
	
	private static final String GET_USER_BY_USERNAME_QUERY = "from UserEntity as user where user.login = ?";
	
	private List<RegistrationValidator> registrationValidators;
	
	public void setRegistrationValidators(List<RegistrationValidator> registrationValidators) {
		this.registrationValidators = registrationValidators;
	}
	
	@Transactional(readOnly = true)
	public UserEntity getUserByUsername(String username) {
		Session session = getSession();
		Query query = session.createQuery(GET_USER_BY_USERNAME_QUERY);
		query.setString(0, username);
		List<UserEntity> users = query.list();
		UserEntity resultUser = null;
		if(users.size() > 0) {
			resultUser = users.get(0);
		}
		return resultUser;
	}
	
	@Transactional
	public void registerUser(UserEntity toRegister) throws RegistrationException {
		for(RegistrationValidator validator : registrationValidators) {
			validator.processRegistrationEntry(toRegister);
		}
		
		getSession().save(toRegister);
	}

}
