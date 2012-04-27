package edu.pk.carservice.actions;

import org.springframework.security.core.context.SecurityContextHolder;

public class DashboardAction {
	
	private String name;
	
	public String execute() {
		name = SecurityContextHolder.getContext().getAuthentication().getName();
		return "SUCCESS";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
