package edu.pk.carservice.container;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.pk.carservice.entity.Rating;
import edu.pk.carservice.entity.Service;

public class RatingsContainer extends HibernateDaoSupport{

	private Rating rating;
	private Service service;
	//private UserEntity user;
	
//	private VehicleRepairDAO vehicleRepairSessionBean;
//	private BillsDAO billSessionBean;
	
	
	public RatingsContainer(){
		
	}
	
/*	public void findByRating(Rating newRating){
		
		rating = newRating;

		VehicleRepair relatedRepair = vehicleRepairSessionBean.findRepairByRatingId(rating.getId());
		Bill relatedBill = relatedRepair.getBill();
		
		service = relatedBill.getService();
					
	}
	
	public void setVehicleRepairSessionBean(VehicleRepairDAO vehicleRepairSessionBean){
		this.vehicleRepairSessionBean = vehicleRepairSessionBean;
	}
	public void setBillSessionBean(BillsDAO billSessionBean) {
		this.billSessionBean = billSessionBean;
	}
	*/

	public void setRating(Rating rating){
		this.rating = rating;
	}
	public Rating getRating(){
		return rating;
	}
	
	public void setService(Service service){
		this.service = service;
	}
	public Service getService(){
		return service;
	}

	

	//public UserEntity getUser(){
	//	return user;
	//}
	
	
	
}
