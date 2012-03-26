package edu.pk.carservice;

public class Welcome {

	private String userName;
	private String password;
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
		setMessage("Hello: " + userName + " " + password);
		return "SUCCESS";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
