package edu.pk.carservice.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import edu.pk.carservice.dao.ServicesDAO;
import edu.pk.carservice.entity.Service;

public class ServiceSessionBean extends HibernateDaoSupport implements ServicesDAO{

	private static final String LIST_ALL_SERVICES = "from Service";
	
	@Transactional(readOnly = true)
	public Service getServiceById(int serviceId) {

		Session session = getSession();

		Service service = (Service) session.get(Service.class, serviceId);
		
		return service;
	}

	@Transactional(readOnly = true)
	public List<Service> listServices() {
		
		Session session = getSession();
		
		List<Service> services = session.createQuery(LIST_ALL_SERVICES).list();
			
		return services;
	}

}
