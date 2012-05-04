package edu.pk.carservice.dao;

import java.util.List;

import edu.pk.carservice.entity.Car;
import edu.pk.carservice.entity.DataCar;
import edu.pk.carservice.entity.UserEntity;

public interface CarsDAO {
	
	public List<DataCar> listAllDataCarsOfUser(UserEntity User);
	public void saveCar(Car car);

}
