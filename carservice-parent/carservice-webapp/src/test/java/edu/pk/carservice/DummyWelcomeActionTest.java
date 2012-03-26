package edu.pk.carservice;

import junit.framework.TestCase;

public class DummyWelcomeActionTest extends TestCase {
	
	private Welcome welcomeAction;
	
	public DummyWelcomeActionTest() {
		welcomeAction = new Welcome();
	}
	
	public void testIfLoginResultIsFailureWhenLoginDataIsIncorrect() {
		welcomeAction.setUserName("wronglogin");
		welcomeAction.setPassword("wrongpassword");
		String result = welcomeAction.execute();
		
		assertEquals(Welcome.FAILURE, result);
	}
	
	public void testIfLoginResultIsSuccessWhenLoginDataIsCorrect() {
		welcomeAction.setUserName("mateusz");
		welcomeAction.setPassword("finepassword");
		String result = welcomeAction.execute();
		
		assertEquals(Welcome.SUCCESS, result);
	}
}
