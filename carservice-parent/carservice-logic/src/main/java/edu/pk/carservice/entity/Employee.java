package edu.pk.carservice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {

	private Integer id;
	private Boolean isAdmin;
	private String position;
	private UserEntity user;

	public Employee() {
	}

	public Employee(Boolean isAdmin, UserEntity user) {
		this.isAdmin = isAdmin;
		this.user = user;
	}

	public Employee(Boolean isAdmin, String position, UserEntity user) {
		this.isAdmin = isAdmin;
		this.position = position;
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPK_ID", nullable = false, unique = true)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "EMP_ISADMIN", nullable = false)
	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Column(name = "EMP_POSITION")
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@OneToOne(cascade = CascadeType.ALL)
	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

}
