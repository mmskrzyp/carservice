package edu.pk.carservice.session;

import static org.junit.Assert.assertEquals;

import java.util.List;

import edu.pk.carservice.entity.Address;

public class AddressSessionBeanTest {

	String expectedStreet = "Norwida";
	
	public void testIfAddressIsCorrectlyRetrieved(){
		
		AddressSessionBean addressSession = new AddressSessionBean();
		
		Address address = addressSession.getAddressById(5);
		
		assertEquals(expectedStreet, address.getStreet());
		
	}
	
	public void testIfAllAddressesAreCorrectlyListed(){
		
		AddressSessionBean addressSession = new AddressSessionBean();
		
		List<Address> addresses = addressSession.listAddresses();
		
		assertEquals(expectedStreet, addresses.get(4).getStreet());
	}
}
