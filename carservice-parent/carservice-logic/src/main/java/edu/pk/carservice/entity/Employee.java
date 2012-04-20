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
 @Table(name="EMPLOYEES")
public class Employee {

	
	private Integer empkId;
	 private Boolean empIsAdmin;
	 private String empPosition;
	 private User empUser;
	
	 public Employee(){
	 }
	 
	 public Employee(Boolean empIsAdmin, User empUser) {
			this.empIsAdmin = empIsAdmin;
			this.empUser = empUser;
		}
	 
	 public Employee(Boolean empIsAdmin, String empPosition, User empUser) {
		this.empIsAdmin = empIsAdmin;
		this.empPosition = empPosition;
		this.empUser = empUser;
	}

	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="EMPK_ID", nullable=false, unique=true)
	public Integer getEmpkId() {
		return empkId;
	}
	public void setEmpkId(Integer empkId) {
		this.empkId = empkId;
	}
	
	
	@Column(name="EMP_ISADMIN", nullable=false)
	public Boolean getEmpIsAdmin() {
		return empIsAdmin;
	}
	public void setEmpIsAdmin(Boolean empIsAdmin) {
		this.empIsAdmin = empIsAdmin;
	}
	
	@Column(name="EMP_POSITION")
	public String getEmpPosition() {
		return empPosition;
	}
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	public User getEmpUser() {
		return empUser;
	}
	public void setEmpUser(User empUser) {
		this.empUser = empUser;
	}
	 
	 
	 
}
