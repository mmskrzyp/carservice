package edu.pk.carservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="CARS")
public class Car {

	private Integer id;
	private User user;
	private DataCar dataCar;
	
	public Car(){
		
	}
	
	public Car(User user, DataCar dataCar) {
		this.user = user;
		this.dataCar = dataCar;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CARK_ID", nullable= false, unique=true)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@OneToOne //TODO czy many to one?
	public DataCar getDataCar() {
		return dataCar;
	}

	public void setDataCar(DataCar dataCar) {
		this.dataCar = dataCar;
	}
	
	
	
	
}
