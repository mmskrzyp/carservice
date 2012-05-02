package edu.pk.carservice.container;

import edu.pk.carservice.entity.Rating;
import edu.pk.carservice.entity.Service;
import edu.pk.carservice.entity.UserEntity;

public class RatingsContainer {

	private Rating rating;
	private Service service;
	private UserEntity user;

	public RatingsContainer(){
	}

	public void setRating(Rating rating){
		this.rating = rating;
	}
	public Rating getRating(){
		return rating;
	}
	
	public void setService(Service service){
		this.service = service;
	}
	public Service getService(){
		return service;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
	
}
