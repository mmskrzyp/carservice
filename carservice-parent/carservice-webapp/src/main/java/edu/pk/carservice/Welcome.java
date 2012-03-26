package edu.pk.carservice;

public class Welcome {

	private String userName;
	private String message;

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
		setMessage("Hello: " + userName);
		return "SUCCESS";
	}
}
