package edu.pk.carservice.exceptions;

public class NoWorkshopInfoException extends RuntimeException {
	
	public NoWorkshopInfoException() {
		super("No workshop information found in database.");
	}
}
