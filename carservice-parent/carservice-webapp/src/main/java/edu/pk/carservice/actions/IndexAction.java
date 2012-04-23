package edu.pk.carservice.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import edu.pk.carservice.session.SessionKeysConstants;

public class IndexAction implements SessionAware {

	public static final String NOT_LOGGED = "NOT_LOGGED";
	public static final String LOGGED = "LOGGED";
	
	private Map<String, Object> sessionMap;
	
	public IndexAction() {
		
	}
	
	public String execute() {
		String result = NOT_LOGGED;
		if(sessionMap.containsKey(SessionKeysConstants.LOGIN)) {
			result = LOGGED;
		}
		return result;
	}
	
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}
}
