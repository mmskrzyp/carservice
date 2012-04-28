package edu.pk.carservice.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import edu.pk.carservice.dao.AddressesDAO;
import edu.pk.carservice.entity.Address;

public class AddressSessionBean extends HibernateDaoSupport implements AddressesDAO {

	@Transactional
	public void saveNewAddress(Address address) {

		Session session = getSession();
		session.save(address);

	}

	@Transactional(readOnly = true)
	public Address getAddressById(int id) {

		Session session = getSession();

		Address address = (Address) session.get(Address.class, id);

		return address;
	}

	@Transactional(readOnly = true)
	public List<Address> listAddresses() {
		Session session = getSession();

		List<Address> addresses = session.createQuery("from Address").list();

		return addresses;
	}

}
