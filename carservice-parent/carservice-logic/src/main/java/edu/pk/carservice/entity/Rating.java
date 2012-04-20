package edu.pk.carservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RATINGS")
public class Rating {
	
	private Integer id;
	private Integer rating; //TODO mo¿e zmieniæ nazwê?
	private String comment;
	private Boolean confirm;
	
	public Rating(){
		
	}
	
	public Rating(Integer rating) {
		this.rating = rating;
	}
	
	
	public Rating(Integer rating, String comment, Boolean confirm) {
		this.rating = rating;
		this.comment = comment;
		this.confirm = confirm;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RATK_ID", nullable=false, unique=true)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="RAT_RATING", nullable=false)
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	@Column(name="RAT_COMMENT")
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Column(name="RAT_CONFIRM")
	public Boolean getConfirm() {
		return confirm;
	}
	public void setConfirm(Boolean confirm) {
		this.confirm = confirm;
	}
	
	
	
	

}
