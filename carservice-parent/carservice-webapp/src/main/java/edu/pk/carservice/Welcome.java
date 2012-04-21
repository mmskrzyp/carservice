package edu.pk.carservice;

import java.util.List;

import edu.pk.carservice.entity.User;
import edu.pk.carservice.session.UserSessionBean;

public class Welcome {

	public static final String SUCCESS = "SUCCESS";
	public static final String FAILURE = "FAILURE";
	
	private String userName;
	private String password;
	private String message;

	private UserSessionBean userSession;
	
	public Welcome() {
		
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String execute() {
		
		userSession = new UserSessionBean();
		
		List<User> allUsers = userSession.listUsers();
		
		
			for(User currentUser : allUsers) //TODO narazie testowo
			{
				if(userName.equals(currentUser.getLogin()) || password.equals(currentUser.getPassword()))
				{
					setMessage("Hello: " + currentUser.getName() + " " + currentUser.getSurname());
					return SUCCESS;
				}
			}
		
		return FAILURE;
		//if(!userName.equals("mateusz") || !password.equals("finepassword")) {
		//	return FAILURE;
			//}
		//setMessage("Hello: " + userName + " " + password);
		//return SUCCESS;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
