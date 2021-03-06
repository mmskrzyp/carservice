package edu.pk.carservice.dao;

import java.util.List;

import edu.pk.carservice.container.RatingsContainer;
import edu.pk.carservice.entity.Rating;

public interface RatingsDAO {

	public Rating getRatingById(int ratingId);
	public List<Rating> listRatings();
	public List<RatingsContainer> getRatingRelatedData();
	
}
