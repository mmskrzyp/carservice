package edu.pk.carservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="REQUIRED_PARTS")
public class RequiredPart {
	
	private Integer id;
	private Integer count;
	private VehicleRepair repair;
	private Part part;
	
	public RequiredPart(){
	}
	
	public RequiredPart(Integer count, VehicleRepair repair, Part part) {
		this.count = count;
		this.repair = repair;
		this.part = part;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="REQK_ID", nullable=false, unique=true)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="REQ_COUNT", nullable=false)
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	@ManyToOne
	public VehicleRepair getRepair() {
		return repair;
	}
	public void setRepair(VehicleRepair repair) {
		this.repair = repair;
	}
	
	@ManyToOne
	public Part getPart() {
		return part;
	}
	public void setPart(Part part) {
		this.part = part;
	}
	
	
	

}
