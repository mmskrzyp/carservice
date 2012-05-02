package edu.pk.carservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "WORKSHOP_INFO")
public class Workshop {
	
	@Id
	@GeneratedValue
	@Column(name="WORK_ID")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "ADDK_ID", referencedColumnName = "ADDK_ID")
	private Address address;
	
	@Column(name="WOR_DESCRIPTION")
	private String description;
	
	@Column(name="WOR_LATITUDE")
	private long latitude;
	
	@Column(name = "WOR_LONGITUDE")
	private long longitude;
	
	@Column(name = "WOR_PHONE_NUMBER")
	private String phoneNumber;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getLatitude() {
		return latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}	
	
	public double getDoubleLatitude() {
		return ((double)latitude)/1E6;
	}
	
	public double getDoubleLongitude() {
		return ((double)longitude)/1E6;
	}
	
}
