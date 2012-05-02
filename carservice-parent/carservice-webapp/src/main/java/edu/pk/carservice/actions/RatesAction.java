package edu.pk.carservice.actions;

import java.util.ArrayList;
import java.util.List;

import edu.pk.carservice.container.RatingsContainer;
import edu.pk.carservice.dao.RatingsDAO;
import edu.pk.carservice.dao.VehicleRepairDAO;
import edu.pk.carservice.entity.Bill;
import edu.pk.carservice.entity.Car;
import edu.pk.carservice.entity.Rating;
import edu.pk.carservice.entity.VehicleRepair;

public class RatesAction {

	public static final String SUCCESS = "SUCCESS";
	//public static final String FAILURE = "FAILURE";
	
	private RatingsDAO ratingSessionBean;
	private VehicleRepairDAO vehicleRepairSessionBean;
	
	private List<Rating> allRatings;
	
	private List<RatingsContainer> allData;

	
public String execute(){
				
		allRatings = ratingSessionBean.listRatings();
		allData = new ArrayList<RatingsContainer>();
		
		for(Rating rating : allRatings)
		{
			RatingsContainer container = new RatingsContainer();
			container = findByRating(rating);
			allData.add(container);
		}
		
		//if(allData.size()>0)
			return SUCCESS;
		
	//	return FAILURE;
	}

	public void setRatingSessionBean(RatingsDAO ratingSessionBean){
		this.ratingSessionBean = ratingSessionBean;
	}
	public void setVehicleRepairSessionBean(VehicleRepairDAO vehicleRepairSessionBean){
		this.vehicleRepairSessionBean = vehicleRepairSessionBean;
	}
	
	public List<Rating> getAllRatings(){
		return allRatings;
	}
	
	public List<RatingsContainer> getAllData(){
		return allData;
	}
	
	public RatingsContainer findByRating(Rating newRating){
		
		RatingsContainer con = new RatingsContainer();
		con.setRating(newRating);

		VehicleRepair relatedRepair = vehicleRepairSessionBean.findRepairByRatingId(newRating.getId());
		Bill relatedBill = relatedRepair.getBill();
				
		con.setService(relatedBill.getService());
		
		Car relatedCar = relatedRepair.getCar();
		
		con.setUser(relatedCar.getUser());
		
		return con;
	}
	
}
