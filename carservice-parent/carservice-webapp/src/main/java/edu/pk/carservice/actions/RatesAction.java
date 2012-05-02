package edu.pk.carservice.actions;

import java.util.List;

import edu.pk.carservice.container.RatingsContainer;
import edu.pk.carservice.dao.RatingsDAO;
import edu.pk.carservice.entity.Rating;

public class RatesAction {

	public static final String SUCCESS = "SUCCESS";

	private RatingsDAO ratingSessionBean;

	private List<Rating> allRatings;

	private List<RatingsContainer> allData;

	public String execute() {

		allData = ratingSessionBean.getRatingRelatedData();

		return SUCCESS;
	}

	public void setRatingSessionBean(RatingsDAO ratingSessionBean) {
		this.ratingSessionBean = ratingSessionBean;
	}

	public List<Rating> getAllRatings() {
		return allRatings;
	}

	public List<RatingsContainer> getAllData() {
		return allData;
	}

}
