package edu.pk.carservice.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE_REPAIRS")
public class VehicleRepair {

	private Integer id;
	private Date date;
	private Car car;
	private Employee employee;
	private Bill bill;
	private StateCar state;
	private Rating rating;

	public VehicleRepair() {

	}

	public VehicleRepair(Date date, Car car, Employee employee, Bill bill,
			StateCar state, Rating rating) {
		this.date = date;
		this.car = car;
		this.employee = employee;
		this.bill = bill;
		this.state = state;
		this.rating = rating;
	}

	public VehicleRepair(Date date, Car car, Employee employee, Bill bill,
			StateCar state) {
		this.date = date;
		this.car = car;
		this.employee = employee;
		this.bill = bill;
		this.state = state;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VEHK_ID", nullable = false, unique = true)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "VEH_DATE", nullable = false)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@ManyToOne
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@ManyToOne
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@JoinColumn(name = "BIL_BILL", referencedColumnName = "BILK_ID")
	@ManyToOne
	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	@ManyToOne
	public StateCar getState() {
		return state;
	}

	public void setState(StateCar state) {
		this.state = state;
	}

	@JoinColumn(name = "RAT_RATING", referencedColumnName = "RATK_ID", nullable = true)
	@OneToOne(cascade = CascadeType.ALL)
	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

}
