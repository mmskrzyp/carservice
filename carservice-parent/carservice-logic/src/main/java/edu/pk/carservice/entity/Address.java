package edu.pk.carservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ADDRESSES")
public class Address {

	private Integer id;
	private String country;
	private String city;
	private String postalCode;
	private String street;
	private Integer houseNumber;
	private Integer apartmentNumber;

	public Address() {
	}

	public Address(String city, String postalCode, Integer houseNumber) {
		this.city = city;
		this.postalCode = postalCode;
		this.houseNumber = houseNumber;
	}

	public Address(String country, String city, String postalCode,
			String street, Integer houseNumber, Integer appNumber) {
		this.country = country;
		this.city = city;
		this.postalCode = postalCode;
		this.street = street;
		this.houseNumber = houseNumber;
		this.apartmentNumber = appNumber;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ADDK_ID", nullable=false, unique=true)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="ADD_COUNTRY", length=20)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name="ADD_CITY", nullable=false, length=20)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name="ADD_POSTAL_CODE", nullable=false, length=6)
	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String addPostalCode) {
		this.postalCode = addPostalCode;
	}

	@Column(name="ADD_STREET", length = 30)
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name="ADD_HOUSE_NUMBER", nullable=false)
	public Integer getHouseNumber() {
		return this.houseNumber;
	}

	public void setHouseNumber(Integer houseNumber) {
		this.houseNumber = houseNumber;
	}

	@Column(name="ADD_APP_NUMBER")
	public Integer getApartmentNumber() {
		return this.apartmentNumber;
	}

	public void setApartmentNumber(Integer appNumber) {
		this.apartmentNumber = appNumber;
	}

}
