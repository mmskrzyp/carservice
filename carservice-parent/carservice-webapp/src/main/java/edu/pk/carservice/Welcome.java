package edu.pk.carservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.pk.carservice.entity.User;
import edu.pk.carservice.session.UserSessionBean;

public class Welcome {

	public static final String SUCCESS = "SUCCESS";
	public static final String FAILURE = "FAILURE";
	public static final String ERROR = "ERROR";

	private String userName;
	private String password;
	private String message;

	@Autowired
	private UserSessionBean userSessionBean;

	public Welcome() {

	}

	public void setUserSessionBean(UserSessionBean usersBean) {
		this.userSessionBean = usersBean;
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
		List<User> allUsers = userSessionBean.listUsers();

		if (allUsers == null) {
			setMessage("allUsers == null");
			return ERROR;
		}

		for (User currentUser : allUsers) // TODO narazie testowo
		{

			// if(userName.equals(currentUser.getLogin()) ||
			// password.equals(currentUser.getPassword()))
			if (userName.equals(currentUser.getLogin())) {
				String hash = UserSessionBean.getHash(password).toString();

				if (hash.equals(currentUser.getPassword())) {
					setMessage("Hello: " + currentUser.getName() + " "
							+ currentUser.getSurname() + " " + hash + " "
							+ currentUser.getPassword());
					return SUCCESS;
				}
			}
		}

		return FAILURE;
		// if(!userName.equals("mateusz") || !password.equals("finepassword")) {
		// return FAILURE;
		// }
		// setMessage("Hello: " + userName + " " + password);
		// return SUCCESS;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
