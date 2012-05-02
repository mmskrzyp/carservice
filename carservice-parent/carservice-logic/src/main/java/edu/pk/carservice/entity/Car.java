package edu.pk.carservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="CARS")
public class Car {

	private Integer id;
	private UserEntity user;
	private DataCar dataCar;
	
	public Car(){
		
	}
	
	public Car(UserEntity user, DataCar dataCar) {
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

	@JoinColumn(name = "USE_USER", referencedColumnName = "USEK_ID")
	@ManyToOne
	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	@JoinColumn(name = "DAT_DATA_CAR", referencedColumnName = "DATK_ID")
	@OneToOne //TODO czy many to one?
	public DataCar getDataCar() {
		return dataCar;
	}

	public void setDataCar(DataCar dataCar) {
		this.dataCar = dataCar;
	}
	
	
	
	
}
