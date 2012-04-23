package edu.pk.carservice.session;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import edu.pk.carservice.entity.Address;

public class AddressSessionBean {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveNewAddress(Address address) {

		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();

			session.save(address);

			transaction.commit();

		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}

	}

	public Address getAddressById(int id) {

		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		Address address = null;

		try {
			transaction = session.beginTransaction();

			address = (Address) session.get(Address.class, id);

			transaction.commit();

		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();

			address = null;
		} finally {
			session.close();
		}

		return address;
	}

	public List<Address> listAddresses() {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		List<Address> addresses = null;

		try {

			transaction = session.beginTransaction();

			addresses = session.createQuery("from Address").list();

			transaction.commit();
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();

			addresses = null;
		} finally {
			session.close();
		}

		return addresses;
	}

}
