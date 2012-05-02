package edu.pk.carservice.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import edu.pk.carservice.dao.VehicleRepairDAO;
import edu.pk.carservice.entity.VehicleRepair;

public class VehicleRepairSessionBean extends HibernateDaoSupport implements VehicleRepairDAO {

	@Transactional(readOnly = true)
	public VehicleRepair findRepairByRatingId(int ratingId) {
		
		Query repairQuery = getSession().createQuery("from VehicleRepair r where r.rating = " + ratingId);
		
		List<VehicleRepair> relatedRepairs = repairQuery.list();
		
		VehicleRepair currentRepair = null;
		
		if(relatedRepairs.size()>0) 
		{
			currentRepair = relatedRepairs.get(0); //relacja OneToOne
		}	
		
		return currentRepair;
	}

	
}
