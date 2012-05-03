package edu.pk.carservice.dao;

import java.util.List;

import edu.pk.carservice.entity.Car;
import edu.pk.carservice.entity.VehicleRepair;

public interface VehicleRepairDAO {

	public List<VehicleRepair> listAllRepairsOfCar(Car car);
}
