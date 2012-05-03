package edu.pk.carservice.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import edu.pk.carservice.dao.CarsDAO;
import edu.pk.carservice.entity.Car;
import edu.pk.carservice.entity.DataCar;
import edu.pk.carservice.entity.UserEntity;

public class CarSessionBean extends HibernateDaoSupport implements CarsDAO {

	@Transactional(readOnly = true)
	public List<DataCar> listAllDataCarsOfUser(UserEntity user) {

		Session session = getSession();

		Query query = session.createQuery("from Car c where c.user = "
				+ user.getId());

		List<Car> allCars = query.list();
		List<DataCar> allData = new ArrayList<DataCar>();
		
		for(Car car : allCars)
		{
			allData.add(car.getDataCar());
		}

		return allData;
	}

}
