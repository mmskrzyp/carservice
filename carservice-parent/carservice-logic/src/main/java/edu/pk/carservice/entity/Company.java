package edu.pk.carservice.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Company {

	
	private Integer id;
	private Integer regon;
	private String name;
	private User user;
	
	
	public Company(Integer regon, String name, User user) {
		this.regon = regon;
		this.name = name;
		this.user = user;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COMK_ID", nullable=false, unique=true)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="COM_REGON", nullable=false)//TODO unique??
	public Integer getRegon() {
		return regon;
	}
	public void setRegon(Integer regon) {
		this.regon = regon;
	}
	
	@Column(name="COM_NAME", nullable=false, length=30)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@OneToOne
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
