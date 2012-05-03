package edu.pk.carservice.actions;

import java.util.List;

import org.springframework.security.core.context.SecurityContextHolder;

import edu.pk.carservice.dao.CarsDAO;
import edu.pk.carservice.dao.UsersDAO;
import edu.pk.carservice.entity.Address;
import edu.pk.carservice.entity.DataCar;
import edu.pk.carservice.entity.UserEntity;
import edu.pk.carservice.formatters.AddressFormatter;

public class UserDataAction {

	public static final String SUCCESS = "SUCCESS";

	private String name;
	private String userNames;
	private UserEntity user;
	private List<DataCar> allUserCars;

	private UsersDAO userSessionBean;
	private CarsDAO carSessionBean;
	private AddressFormatter userDataAddressFormatter;

	public String execute() {
		name = SecurityContextHolder.getContext().getAuthentication().getName();
		user = userSessionBean.getUserByUsername(name);
		userNames = user.getName() + " " + user.getSurname();
		allUserCars = carSessionBean.listAllDataCarsOfUser(user);
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserEntity getUser() {
		return user;
	}

	public String getUserNames() {
		return userNames;
	}

	public void setUserSessionBean(UsersDAO userSessionBean) {
		this.userSessionBean = userSessionBean;
	}

	public void setUserDataAddressFormatter(
			AddressFormatter userDataAddressFormatter) {
		this.userDataAddressFormatter = userDataAddressFormatter;
	}

	public String getInlineFormattedAddress() {
		Address address = user.getAddress();
		return userDataAddressFormatter.formatAddress(address);
	}

	public void setCarSessionBean(CarsDAO carSessionBean) {
		this.carSessionBean = carSessionBean;
	}

	public List<DataCar> getAllUserCars() {
		return allUserCars;
	}

}
