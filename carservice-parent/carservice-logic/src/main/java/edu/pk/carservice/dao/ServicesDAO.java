package edu.pk.carservice.dao;

import java.util.List;

import edu.pk.carservice.entity.Service;

public interface ServicesDAO {

	public Service getServiceById(int serviceId);
	public List<Service> listServices();
	
	
}
