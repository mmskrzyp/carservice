package edu.pk.carservice.session;

import edu.pk.carservice.entity.User;
import junit.framework.TestCase;

public class UserSessionBeanTest extends TestCase {
	
	String expectedSurname = "Kowalski";
	
	public void testIfUserIsCorrectlyRetrieved(){
				
		UserSessionBean userSession = new UserSessionBean();
		
		User user = userSession.getUserbyId(1);
		
		assertEquals(expectedSurname, user.getSurname());
	}
	
	public void testPasswordEncryption(){
		
		UserSessionBean userSession = new UserSessionBean();
		
		System.out.print(userSession.getHash("admin1"));
	
		User user = userSession.getUserbyId(1);

		//System.out.print(user.getPassword());
		
		assertEquals(user.getPassword(), UserSessionBean.getHash("admin1"));
	}

}
