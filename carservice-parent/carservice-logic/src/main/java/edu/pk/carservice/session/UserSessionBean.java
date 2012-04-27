package edu.pk.carservice.session;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import edu.pk.carservice.entity.UserEntity;

public class UserSessionBean {
	
	private static final String GET_USER_BY_USERNAME_QUERY = "from UserEntity as user where user.login = ?";
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public UserEntity getUserByUsername(String username) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(GET_USER_BY_USERNAME_QUERY);
		query.setString(0, username);
		List<UserEntity> users = query.list();
		UserEntity resultUser = null;
		if(users.size() > 0) {
			resultUser = users.get(0);
		}
		session.close();
		return resultUser;
	}

}
