package edu.pk.carservice.session;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.pk.carservice.entity.Address;
import edu.pk.carservice.entity.User;

public class UserSessionBean {
	
	
	public User getUserbyId(int id)
	{
		
		Session session = HibernateUtil.getSessionFactory().openSession(); //u¿ycie openSession
		Transaction transaction = null;
		
		User user = null;
		
		try{
			transaction = session.beginTransaction();
			
			user = (User)session.get(User.class, id);
					
			transaction.commit();
			
		}
		catch(HibernateException e){
			if(transaction!=null)
				transaction.rollback();
			e.printStackTrace();
			
			user = null;
		}
		finally{
			session.close();
		}		
		
		return user;
	}
	
	public List<User> listUsers()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		
		List<User> users = null;
		
		try{
			
			transaction = session.beginTransaction();
			
			users = session.createQuery("from User").list();
			
			transaction.commit();
		}
		catch(HibernateException e){
			if(transaction!=null)
				transaction.rollback();
			e.printStackTrace();
				
			users = null;
		}
		finally{
			session.close();
		}
		
		return users;
	}

}
