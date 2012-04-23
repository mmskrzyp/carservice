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
	
	private static final String AUTHENTICATION_QUERY = "from User as user where user.login = ?";

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
		try {
			Query query = session.createQuery(AUTHENTICATION_QUERY);
			query.setString(0, login);
			List<User> users = query.list();
			if (users.size() > 1) {
				throw new InvalidDbResultException();
			}
			boolean authenticated = false;
			if (users.size() == 1) {
				User user = users.get(0);
				String hashedPassword = passwordHasher.encrypt(password);
				if (user.getPassword().equals(hashedPassword)) {
					authenticated = true;
				}
			}
			LoginData loginData = new LoginData();

			loginData.setAuthenticated(authenticated);
			loginData.setUsername(login);

			return loginData;
		} finally {
			session.close();
		}
	}

	public User getUserbyId(int id) {

		Session session = sessionFactory.openSession();
		User user = (User) session.get(User.class, id);
		session.close();
		
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
