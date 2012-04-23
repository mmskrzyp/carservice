package edu.pk.carservice;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import edu.pk.carservice.entity.User;
import edu.pk.carservice.session.UserSessionBean;

public class Welcome implements SessionAware {

	public static final String SUCCESS = "SUCCESS";
	public static final String FAILURE = "FAILURE";
	public static final String ERROR = "ERROR";

	private String userName;
	private String password;
	private String message;
	private Map<String, Object> sessionMap;

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

		for (User currentUser : allUsers) {
			if (userName.equals(currentUser.getLogin())) {
				String hash = UserSessionBean.getHash(password).toString();
				if (hash.equals(currentUser.getPassword())) {
					sessionMap.put("login", currentUser.getLogin());
					return SUCCESS;
				}
			}
		}

		return FAILURE;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}
}
