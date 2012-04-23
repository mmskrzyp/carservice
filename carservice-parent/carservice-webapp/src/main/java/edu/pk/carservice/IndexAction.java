package edu.pk.carservice;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class IndexAction implements SessionAware {

	public static final String NOT_LOGGED = "NOT_LOGGED";
	public static final String LOGGED = "LOGGED";
	
	private Map<String, Object> sessionMap;
	
	public IndexAction() {
		
	}
	
	public String execute() {
		String result = NOT_LOGGED;
		if(sessionMap.containsKey("login")) {
			result = LOGGED;
		}
		return result;
	}
	
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}
}
