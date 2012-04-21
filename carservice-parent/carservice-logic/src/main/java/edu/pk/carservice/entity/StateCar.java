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
	
	private Integer id;
	private String stateBefore;
	private String stateAfter;
	
	public StateCar(){
		
	}
	
	public StateCar(String stateBefore, String stateAfter) {
		this.stateBefore = stateBefore;
		this.stateAfter = stateAfter;
	}
	public StateCar(String stateBefore) {
		this.stateBefore = stateBefore;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="STAK_ID", nullable=false, unique=true)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="STA_STATE_BEFORE", nullable=false, length=50)
	public String getStateBefore() {
		return stateBefore;
	}
	public void setStateBefore(String stateBefore) {
		this.stateBefore = stateBefore;
	}
	
	@Column(name="STA_STATE_AFTER", length=50)
	public String getStateAfter() {
		return stateAfter;
	}
	public void setStateAfter(String stateAfter) {
		this.stateAfter = stateAfter;
	}
	
	

}
