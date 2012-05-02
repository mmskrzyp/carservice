package edu.pk.carservice.actions;

import edu.pk.carservice.dao.UsersDAO;
import edu.pk.carservice.entity.Address;
import edu.pk.carservice.entity.UserEntity;
import edu.pk.carservice.exceptions.RegistrationException;

public class RegistrationAction {
	
	public static final String SUCCESS_RESULT = "SUCCESS";
	public static final String FAILURE_RESULT = "FAILURE";
	
	private UserEntity userToRegister;
	private Address address;
	private String errorMessage;
	private UsersDAO userSessionBean;
	
	public RegistrationAction() {
		userToRegister = new UserEntity();
		address = new Address();
	}
	
	public void setUserSessionBean(UsersDAO usersSessionBean) {
		this.userSessionBean = usersSessionBean;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setUserToRegister(UserEntity userToRegister) {
		this.userToRegister = userToRegister;
	}
	
	public UserEntity getUserToRegister() {
		return userToRegister;
	}
	
	public String execute() {
		userToRegister.setAddress(address);
		try {
			userSessionBean.registerUser(userToRegister);
			return SUCCESS_RESULT;
		} catch(RegistrationException e) {
			errorMessage = e.getMessage();
			return FAILURE_RESULT;
		}
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
}
