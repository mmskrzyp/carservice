package edu.pk.carservice.registration;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.pk.carservice.entity.UserEntity;
import edu.pk.carservice.exceptions.EmailAlreadyTaken;
import edu.pk.carservice.exceptions.LoginAlreadyTaken;
import edu.pk.carservice.exceptions.PeselAlreadyTaken;
import edu.pk.carservice.exceptions.RegistrationException;

public class PrimaryUserDataAreUniqueChecker extends HibernateDaoSupport implements RegistrationValidator {

	private static final String CAN_BE_REGISTERED_QUERY = 
			"from UserEntity as user where user.login = ? or user.pesel = ? or user.email = ?";
	
	public void processRegistrationEntry(UserEntity toRegister) throws RegistrationException {
		Query query = getSession().createQuery(CAN_BE_REGISTERED_QUERY);
		
		query.setString(0, toRegister.getLogin());
		query.setInteger(1, toRegister.getPesel());
		query.setString(2, toRegister.getEmail());
		
		List<UserEntity> users = query.list();
		
		for(UserEntity user : users) {
			if(user.getLogin().equals(toRegister.getLogin())) {
				throw new LoginAlreadyTaken(toRegister.getLogin());
			}
			if(user.getPesel().equals(toRegister.getPesel())) {
				throw new PeselAlreadyTaken(toRegister.getPesel().toString());
			}
			if(user.getEmail().equals(toRegister.getEmail())) {
				throw new EmailAlreadyTaken(toRegister.getEmail());
			}
		}
	}

}
