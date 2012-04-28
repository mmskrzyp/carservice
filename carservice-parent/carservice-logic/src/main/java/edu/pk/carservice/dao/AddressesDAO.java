package edu.pk.carservice.dao;

import java.util.List;

import edu.pk.carservice.entity.Address;

public interface AddressesDAO {
	
	public Address getAddressById(int addressId);
	public List<Address> listAddresses();
}
