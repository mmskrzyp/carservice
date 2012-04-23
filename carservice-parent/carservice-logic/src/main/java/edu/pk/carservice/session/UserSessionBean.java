package edu.pk.carservice.session;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import edu.pk.carservice.authentication.InvalidDbResultException;
import edu.pk.carservice.authentication.LoginData;
import edu.pk.carservice.encryption.PasswordHasher;
import edu.pk.carservice.entity.User;

public class UserSessionBean {

	private SessionFactory sessionFactory;
	private PasswordHasher passwordHasher;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void setPasswordHasher(PasswordHasher passwordHasher) {
		this.passwordHasher = passwordHasher;
	}

	public LoginData authenticate(String login, String password) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from User as user where user.login = ?");
		query.setString(0, login);
		List<User> users = query.list();
		if(users.size() > 1) {
			throw new InvalidDbResultException();
		}
		boolean authenticated = false;
		if(users.size() == 1) {
			User user = users.get(0);
			String hashedPassword = passwordHasher.encrypt(password);
			if(user.getPassword().equals(hashedPassword)) {
				authenticated = true;
			}
		}
		LoginData loginData = new LoginData();
		
		loginData.setAuthenticated(authenticated);
		loginData.setUsername(login);
		
		return loginData;
	}
	
	public User getUserbyId(int id) {

		Session session = sessionFactory.openSession(); // u¿ycie
														// openSession
		Transaction transaction = null;

		User user = null;

		try {
			transaction = session.beginTransaction();

			user = (User) session.get(User.class, id);

			transaction.commit();

		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();

			user = null;
		} finally {
			session.close();
		}

		return user;
	}

	public List<User> listUsers() {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		List<User> users = null;

		try {

			transaction = session.beginTransaction();

			users = session.createQuery("from User").list();

			transaction.commit();
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();

			users = null;
		} finally {
			session.close();
		}

		return users;
	}

}
