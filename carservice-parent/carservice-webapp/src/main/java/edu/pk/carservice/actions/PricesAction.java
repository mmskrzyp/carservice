package edu.pk.carservice.actions;

import java.util.List;

import edu.pk.carservice.dao.ServicesDAO;
import edu.pk.carservice.entity.Service;

public class PricesAction {
	
	public static final String SUCCESS = "SUCCESS";
	public static final String FALIURE = "FALIURE";
	
	private Service service;
	private ServicesDAO serviceSessionBean;
	
	private List<Service> allServices;
	
	public String execute(){
				
		allServices = serviceSessionBean.listServices();
		
		return SUCCESS;
		
	}
	
	public void setServiceSessionBean(ServicesDAO serviceSessionBean){
		this.serviceSessionBean = serviceSessionBean;
	}
	
	public Service getService(){
		return service;
	}
	public List<Service> getAllServices(){
		return allServices;
	}
	

}
