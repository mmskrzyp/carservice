package edu.pk.carservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STATE_CARS")
public class StateCar {
	
	private Integer stakId;
	private String staStateBefore;
	private String staStateAfter;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="STAK_ID", nullable=false, unique=true)
	public Integer getStakId() {
		return stakId;
	}
	public void setStakId(Integer stakId) {
		this.stakId = stakId;
	}
	
	@Column(name="STA_STATE_BEFORE", nullable=false, length=50)
	public String getStaStateBefore() {
		return staStateBefore;
	}
	public void setStaStateBefore(String staStateBefore) {
		this.staStateBefore = staStateBefore;
	}
	
	@Column(name="STA_STATE_AFTER", length=50)
	public String getStaStateAfter() {
		return staStateAfter;
	}
	public void setStaStateAfter(String staStateAfter) {
		this.staStateAfter = staStateAfter;
	}
	
	

}
