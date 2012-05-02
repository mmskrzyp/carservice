package edu.pk.carservice.dao.impl;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import edu.pk.carservice.dao.BillsDAO;
import edu.pk.carservice.entity.Bill;

public class BillSessionBean extends HibernateDaoSupport implements BillsDAO{

	@Transactional(readOnly = true)
	public Bill getBillById(int billId) {
		
		Session session = getSession();

		Bill bill = (Bill) session.get(Bill.class, billId);
		
		return bill;
	}

}
