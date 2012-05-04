package edu.pk.carservice.actions;

import org.springframework.security.core.context.SecurityContextHolder;

import edu.pk.carservice.dao.CarsDAO;
import edu.pk.carservice.dao.UsersDAO;
import edu.pk.carservice.entity.Car;
import edu.pk.carservice.entity.DataCar;
import edu.pk.carservice.entity.UserEntity;

public class AddCarAction {

	public static final String SUCCESS_RESULT = "SUCCESS";
	public static final String FAILURE_RESULT = "FAILURE";

	private Car carToAdd;
	private DataCar carData;
	private UserEntity user;
	private String errorMessage;

	private UsersDAO userSessionBean;
	private CarsDAO carSessionBean;

	private AddCarAction() {

		carToAdd = new Car();
		carData = new DataCar();
	}

	public String execute() {

		String name = SecurityContextHolder.getContext().getAuthentication()
				.getName();
		user = userSessionBean.getUserByUsername(name);

		carToAdd.setUser(user);
		carToAdd.setDataCar(carData);

		try{
			carSessionBean.saveCar(carToAdd);
			return SUCCESS_RESULT;
		} catch (IllegalArgumentException e){
				setErrorMessage(e.getMessage());
			return FAILURE_RESULT;
		}

	}

	public Car getCarToAdd() {
		return carToAdd;
	}

	public void setCarToAdd(Car carToAdd) {
		this.carToAdd = carToAdd;
	}

	public DataCar getCarData() {
		return carData;
	}

	public void setCarData(DataCar carData) {
		this.carData = carData;
	}

	public void setUserSessionBean(UsersDAO userSessionBean) {
		this.userSessionBean = userSessionBean;
	}

	public void setCarSessionBean(CarsDAO carSessionBean) {
		this.carSessionBean = carSessionBean;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
