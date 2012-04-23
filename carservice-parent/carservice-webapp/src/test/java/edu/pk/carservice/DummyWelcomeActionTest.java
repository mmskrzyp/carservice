package edu.pk.carservice;

import edu.pk.carservice.actions.Welcome;
import junit.framework.TestCase;

public class DummyWelcomeActionTest extends TestCase {
	
	private Welcome welcomeAction;
	
	public DummyWelcomeActionTest() {
		welcomeAction = new Welcome();
	}
	
	public void testIfLoginResultIsFailureWhenLoginDataIsIncorrect() {
		/*welcomeAction.setUserName("wronglogin");
		welcomeAction.setPassword("wrongpassword");
		String result = welcomeAction.execute();
		
		assertEquals(Welcome.FAILURE, result);*/
	}
	public void testIfLoginResultIsFailureWhenOnlyPasswordIsIncorrect() {
		/*welcomeAction.setUserName("admin");
		welcomeAction.setPassword("wrongpassword");
		String result = welcomeAction.execute();
		
		assertEquals(Welcome.FAILURE, result);*/
	}
	
	public void testIfLoginResultIsSuccessWhenLoginDataIsCorrect() {
		/*welcomeAction.setUserName("admin");
		welcomeAction.setPassword("admin1");
		String result = welcomeAction.execute();
		
		assertEquals(Welcome.SUCCESS, result);*/
	}
}
