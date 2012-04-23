package edu.pk.carservice.actions;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import edu.pk.carservice.authentication.LoginData;
import edu.pk.carservice.entity.User;
import edu.pk.carservice.session.SessionKeysConstants;
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
		LoginData loginData = userSessionBean.authenticate(userName, password);
		if(loginData.isAuthenticated()) {
			sessionMap.put(SessionKeysConstants.LOGIN, userName);
			return SUCCESS;
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
