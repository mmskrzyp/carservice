package edu.pk.carservice.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="REPLACEMENT_CARS")
public class ReplacementCar {
	
	private Integer id;
	private Boolean available;
	private BigDecimal dailyPrice;
	private Date checkExpireDate;	//TODO zastanowiæ siê!!
	private Car car;
	
	public ReplacementCar(){
	}
	
	public ReplacementCar(Boolean available, BigDecimal dailyPrice,
			Date checkExpireDate, Car car) {
		this.available = available;
		this.dailyPrice = dailyPrice;
		this.checkExpireDate = checkExpireDate;
		this.car = car;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="REPK_ID", nullable=false, unique=true)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="REP_AVAILABLE", nullable=false)
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}

	@Column(name="REP_DAILY_PRICE", nullable=false)
	public BigDecimal getDailyPrice() {
		return dailyPrice;
	}
	public void setDailyPrice(BigDecimal dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	@Column(name="REP_CHECK_EXPIRE_DATE", nullable=false)
	public Date getCheckExpireDate() {
		return checkExpireDate;
	}
	public void setCheckExpireDate(Date checkExpireDate) {
		this.checkExpireDate = checkExpireDate;
	}

	@OneToOne
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}

	
	
	
	
	
	
	

}
