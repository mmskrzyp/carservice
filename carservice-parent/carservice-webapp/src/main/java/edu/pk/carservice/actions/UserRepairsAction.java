package edu.pk.carservice.actions;

import java.util.List;

import org.springframework.security.core.context.SecurityContextHolder;

import edu.pk.carservice.dao.CarsDAO;
import edu.pk.carservice.dao.UsersDAO;
import edu.pk.carservice.dao.VehicleRepairDAO;
import edu.pk.carservice.entity.DataCar;
import edu.pk.carservice.entity.UserEntity;
import edu.pk.carservice.entity.VehicleRepair;

public class UserRepairsAction {

	public static final String SUCCESS = "SUCCESS";

	private String name;
	private String userNames;
	private UserEntity user;
	private List<DataCar> allUserCars;
	private List<VehicleRepair> allRepairs;

	private UsersDAO userSessionBean;
	private CarsDAO carSessionBean;
	private VehicleRepairDAO vehicleRepairSessionBean;

	public String execute() {

		name = SecurityContextHolder.getContext().getAuthentication().getName();
		user = userSessionBean.getUserByUsername(name);
		userNames = user.getName() + " " + user.getSurname();
		allUserCars = carSessionBean.listAllDataCarsOfUser(user);
		//allRepairs = vehicleRepairSessionBean.listAllRepairsOfCar(car);
		return SUCCESS;
	}

	public String getUserNames() {
		return userNames;
	}

	public List<DataCar> getAllUserCars() {
		return allUserCars;
	}

	public void setUserSessionBean(UsersDAO userSessionBean) {
		this.userSessionBean = userSessionBean;
	}

	public void setCarSessionBean(CarsDAO carSessionBean) {
		this.carSessionBean = carSessionBean;
	}

	public List<VehicleRepair> getAllRepairs() {
		return allRepairs;
	}

	public void setVehicleRepairSessionBean(
			VehicleRepairDAO vehicleRepairSessionBean) {
		this.vehicleRepairSessionBean = vehicleRepairSessionBean;
	}

}
