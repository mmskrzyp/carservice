package edu.pk.carservice.formatters;

import edu.pk.carservice.entity.Address;

public class InlineAddressFormatter implements AddressFormatter {

	public String formatAddress(Address address) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(address.getStreet()).append(" ");
		sb.append(address.getHouseNumber());
		if(address.getApartmentNumber() != null) {
			sb.append("/").append(address.getApartmentNumber());
		}
		sb.append(", ");
		sb.append(address.getPostalCode()).append(" ");
		sb.append(address.getCity());
		
		return sb.toString();
	}

}
