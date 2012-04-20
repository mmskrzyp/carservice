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
@Table(name="BILLS")
public class Bill {
	
	private Integer id;
	private BigDecimal price;
	private Date date;
	private String type;
	private Integer number;
	private Service service;
	
	public Bill(){
		
	}
	
	public Bill(BigDecimal price, Date date, String type, Integer number,
			Service service) {
		this.price = price;
		this.date = date;
		this.type = type;
		this.number = number;
		this.service = service;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BILK_ID", nullable=false, unique=true)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="BIL_PRICE", nullable=false)
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Column(name="BIL_DATE", nullable=false)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(name="BIL_TYPE", nullable=false)
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Column(name="BIL_NUMBER", nullable=false, unique=true)
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	@ManyToOne
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	
	

}
