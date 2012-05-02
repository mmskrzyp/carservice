package edu.pk.carservice.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.pk.carservice.container.RatingsContainer;
import edu.pk.carservice.dao.RatingsDAO;
import edu.pk.carservice.entity.Bill;
import edu.pk.carservice.entity.Car;
import edu.pk.carservice.entity.Rating;
import edu.pk.carservice.entity.VehicleRepair;

public class RatingSessionBean extends HibernateDaoSupport implements
		RatingsDAO {

	private static final String LIST_ALL_RATINGS = "from Rating";

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

	public List<RatingsContainer> getRatingRelatedData() {

		List<Rating> allRatings = listRatings();
		List<RatingsContainer> allData = new ArrayList<RatingsContainer>();

		for (Rating rating : allRatings) {

			RatingsContainer con = new RatingsContainer();
			con.setRating(rating);

			VehicleRepair relatedRepair = con.getRating().getVehicleRepair();
			Bill relatedBill = relatedRepair.getBill();

			con.setService(relatedBill.getService());

			Car relatedCar = relatedRepair.getCar();

			con.setUser(relatedCar.getUser());

			allData.add(con);
		}

		return allData;
	}

}
