package edu.pk.carservice.test.formatters;

import org.junit.Test;

import edu.pk.carservice.entity.Address;
import edu.pk.carservice.formatters.AddressFormatter;
import edu.pk.carservice.formatters.InlineAddressFormatter;
import static org.junit.Assert.*;

public class InlineAddressFormatterTest {
	
	private AddressFormatter formatter = new InlineAddressFormatter();
	
	@Test
	public void shouldBeValidForDateWithApartmentNumber() {
		Address address = generateAddress(true);
		
		String formattedAddress = formatter.formatAddress(address);
		String expectedFormattedAdddress = "ul. Krakowska 10/12, 31-900 Krakow";
		assertEquals(formattedAddress, expectedFormattedAdddress);
	}
	
	@Test
	public void shouldBeValidForDateWithoutApartmentNumber() {
		Address address = generateAddress(false);
		
		String formattedAddress = formatter.formatAddress(address);
		String expectedFormattedAdddress = "ul. Krakowska 10, 31-900 Krakow";
		assertEquals(formattedAddress, expectedFormattedAdddress);

	}
	
	private Address generateAddress(boolean withApartmentNumber) {
		Address address = new Address();
		
		address.setCity("Krakow");
		address.setStreet("ul. Krakowska");
		if(withApartmentNumber) {
			address.setApartmentNumber(12);
		}
		address.setHouseNumber(10);
		address.setPostalCode("31-900");
		
		return address;
	}
}
