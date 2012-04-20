package edu.pk.carservice.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PARTS")
public class Part {
	
	private Integer id;
	private String name;
	private BigDecimal price;
	private Integer count;
	private Integer catalogNumber;
	private String producer;
	
	public Part(){
		
	}
	
	public Part(String name, BigDecimal price, Integer count,
			Integer catalogNumber, String producer) {
		this.name = name;
		this.price = price;
		this.count = count;
		this.catalogNumber = catalogNumber;
		this.producer = producer;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PARK_ID", nullable=false, unique=true)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="PAR_NAME", nullable=false, length=100)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="PAR_PRICE", nullable=false)
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Column(name="PAR_COUNT", nullable=false)
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	@Column(name="PAR_CAT_NUMBER", nullable=false, unique=true)
	public Integer getCatalogNumber() {
		return catalogNumber;
	}
	public void setCatalogNumber(Integer catalogNumber) {
		this.catalogNumber = catalogNumber;
	}
	
	@Column(name="PAR_PRODUCER", nullable=false, length=20)
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	

}
