package edu.pk.carservice.actions;

import edu.pk.carservice.dao.WorkshopInfoDAO;
import edu.pk.carservice.entity.Address;
import edu.pk.carservice.entity.Workshop;
import edu.pk.carservice.formatters.AddressFormatter;
import edu.pk.carservice.formatters.GoogleMapsUrlGenerator;

public class ContactAction {

	public static final String SUCCESS = "SUCCESS";
	
	private Workshop workshopModel;
	private WorkshopInfoDAO workshopInfoDao;
	private AddressFormatter workshopContactAddressFormatter;
	private GoogleMapsUrlGenerator googleMapsUrlGenerator;
	
	public String execute() {
		workshopModel = workshopInfoDao.getWorkshopInfo();
		return SUCCESS;
	}
	
	public void setWorkshopInfoDao(WorkshopInfoDAO workshopInfoDao) {
		this.workshopInfoDao = workshopInfoDao;
	}

	public Workshop getWorkshopModel() {
		return workshopModel;
	}
	
	public String getInlineFormattedAddress() {
		Address address = workshopModel.getAddress();
		return workshopContactAddressFormatter.formatAddress(address);
	}
	
	public String getGoogleMapsUrl() {
		return googleMapsUrlGenerator.generateMapsUrl(workshopModel.getDoubleLatitude(), 
				workshopModel.getDoubleLongitude());
	}

	public void setWorkshopContactAddressFormatter(AddressFormatter workshopContactAddressFormatter) {
		this.workshopContactAddressFormatter = workshopContactAddressFormatter;
	}
	
	public void setGoogleMapsUrlGenerator(GoogleMapsUrlGenerator googleMapsUrlGenerator) {
		this.googleMapsUrlGenerator = googleMapsUrlGenerator;
	}

}
