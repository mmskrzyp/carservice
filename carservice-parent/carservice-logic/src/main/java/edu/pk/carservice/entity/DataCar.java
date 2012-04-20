package edu.pk.carservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DATA_CARS")
public class DataCar {

	private Integer id;
	private Integer productionYear;
	private String brand;
	private String model;
	private String engine;
	private Integer mileage;
	private Integer chassisNumber;
	private String regNumber;
	
	public DataCar(){
		
	}
	
	public DataCar(Integer productionYear, String brand, String model,
			Integer chassisNumber, String regNumber) {
		this.productionYear = productionYear;
		this.brand = brand;
		this.model = model;
		this.chassisNumber = chassisNumber;
		this.regNumber = regNumber;
	}
	
	
	
	public DataCar(Integer productionYear, String brand, String model,
			String engine, Integer mileage, Integer chassisNumber,
			String regNumber) {
		this.productionYear = productionYear;
		this.brand = brand;
		this.model = model;
		this.engine = engine;
		this.mileage = mileage;
		this.chassisNumber = chassisNumber;
		this.regNumber = regNumber;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DATK_ID", nullable=false, unique=true)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	@Column(name="DAT_PROD_YEAR", nullable=false)
	public Integer getDatProdYear() {
		return productionYear;
	}
	public void setDatProdYear(Integer datProdYear) {
		this.productionYear = datProdYear;
	}
	
	@Column(name="DAT_BRAND", nullable=false, length=20)
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Column(name="DAT_MODEL", nullable=false, length=20)
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	@Column(name="DAT_ENGINE", length=100)
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	@Column(name="DAT_MILEAGE")
	public Integer getMileage() {
		return mileage;
	}
	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}
	
	@Column(name="DAT_CHASSIS_NUMBER", nullable=false)
	public Integer getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(Integer chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	
	@Column(name="DAT_REG_NUMBER", nullable=false, length=15)
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}


	
	
	
	
}
