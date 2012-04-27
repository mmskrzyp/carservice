package edu.pk.carservice.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="RENTALS")
public class Rental {

	private Integer id;
	private Date date;
	private BigDecimal fullPrice;
	private String paymentType;  //TODO zastanowiæ siê nad enumem
	private ReplacementCar replacementCar;
	private UserEntity user;
	
	public Rental(){
		
	}
	
	public Rental(Date date, BigDecimal fullPrice, String paymentType,
			ReplacementCar replacementCar, UserEntity user) {
		this.date = date;
		this.fullPrice = fullPrice;
		this.paymentType = paymentType;
		this.replacementCar = replacementCar;
		this.user = user;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RENK_ID", nullable=false, unique=true)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="REN_DATE", nullable=false)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(name="REN_FULL_PRICE", nullable=false)
	public BigDecimal getFullPrice() {
		return fullPrice;
	}
	public void setFullPrice(BigDecimal fullPrice) {
		this.fullPrice = fullPrice;
	}
	
	@Column(name="REN_PAYMENT_TYPE", nullable=false, length=30)
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	@ManyToOne
	public ReplacementCar getReplacementCar() {
		return replacementCar;
	}
	public void setReplacementCar(ReplacementCar replacementCar) {
		this.replacementCar = replacementCar;
	}
	
	@ManyToOne
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	

}
