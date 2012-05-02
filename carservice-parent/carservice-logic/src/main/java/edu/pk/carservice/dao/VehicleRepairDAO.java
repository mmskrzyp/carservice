package edu.pk.carservice.dao;

import edu.pk.carservice.entity.VehicleRepair;

public interface VehicleRepairDAO {

	public VehicleRepair findRepairByRatingId(int ratingId);
}
