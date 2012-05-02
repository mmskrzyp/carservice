package edu.pk.carservice.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.pk.carservice.dao.WorkshopInfoDAO;
import edu.pk.carservice.entity.Workshop;
import edu.pk.carservice.exceptions.NoWorkshopInfoException;

public class WorkshopInfoDAOImpl extends HibernateDaoSupport implements WorkshopInfoDAO {

	public Workshop getWorkshopInfo() {
		Session session = getSession();
		List<Workshop> workshops = session.createQuery("from Workshop").list();
		
		if(workshops.size() == 0) {
			throw new NoWorkshopInfoException();
		}
		
		return workshops.get(0);
	}

}
