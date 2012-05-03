package edu.pk.carservice.actions;

import org.springframework.security.core.context.SecurityContextHolder;

import edu.pk.carservice.dao.UsersDAO;
import edu.pk.carservice.entity.UserEntity;

public class DashboardAction {

	private String name;
	private UserEntity user;

	private UsersDAO userSessionBean;

	public String execute() {
		name = SecurityContextHolder.getContext().getAuthentication().getName();
		user = userSessionBean.getUserByUsername(name);
		return "SUCCESS";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUserSessionBean(UsersDAO userSessionBean) {
		this.userSessionBean = userSessionBean;
	}

	public UserEntity getUser() {
		return user;
	}
}
