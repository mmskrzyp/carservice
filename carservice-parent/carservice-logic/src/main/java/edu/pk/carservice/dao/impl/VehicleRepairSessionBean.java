package edu.pk.carservice.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import edu.pk.carservice.dao.VehicleRepairDAO;
import edu.pk.carservice.entity.Car;
import edu.pk.carservice.entity.DataCar;
import edu.pk.carservice.entity.VehicleRepair;

public class VehicleRepairSessionBean extends HibernateDaoSupport implements
		VehicleRepairDAO {

	public List<VehicleRepair> listAllRepairsOfCar(Car car) {

		Session session = getSession();

		Query query = session.createQuery("from VehicleRepair v where v.car = "
				+ car.getId());

		List<VehicleRepair> allRepairs = query.list();

		return allRepairs;
	}

}
