package edu.pk.carservice.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Reservation {

	private Integer id;
	//jak najlepiej przechowaæ t¹ wartoœæ?
	private String date;
	private Boolean isexpres;
	private User user;
	
	
	public Reservation(String date, Boolean isexpres, User user) {
		this.date = date;
		this.isexpres = isexpres;
		this.user = user;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RESK_ID", nullable=false, unique=true)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="RES_DATE", nullable=false)
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Column(name="RES_ISEKSPRESS", nullable=false)
	public Boolean getIsexpres() {
		return isexpres;
	}
	public void setIsexpres(Boolean isexpres) {
		this.isexpres = isexpres;
	}
	
	@ManyToOne
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
