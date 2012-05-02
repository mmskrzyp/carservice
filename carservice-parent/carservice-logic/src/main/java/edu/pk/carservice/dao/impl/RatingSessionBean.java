package edu.pk.carservice.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.pk.carservice.dao.RatingsDAO;
import edu.pk.carservice.entity.Rating;
import edu.pk.carservice.entity.Service;

public class RatingSessionBean extends HibernateDaoSupport implements RatingsDAO{

	private static final String LIST_ALL_RATINGS= "from Rating";
	
	public Rating getRatingById(int ratingId) {
		
		Session session = getSession();

		Rating rating = (Rating) session.get(Rating.class, ratingId);
		
		return rating;

	}

	public List<Rating> listRatings() {
		
		Session session = getSession();
		
		List<Rating> ratings = session.createQuery(LIST_ALL_RATINGS).list();
			
		return ratings;
	}

}
