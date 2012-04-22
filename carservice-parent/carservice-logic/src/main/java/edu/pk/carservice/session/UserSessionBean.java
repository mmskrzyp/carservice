package edu.pk.carservice.session;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sun.tools.javac.util.Convert;

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
	
	public static String getHash(String password)
	{
		try{
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
			//digest.reset();
			byte [] byteHash;
			
			digest.update(password.getBytes());
			
			byteHash = digest.digest();
			
			String stringHash = bytesToHex(byteHash);
			
			return stringHash;
			
		}
		catch(NoSuchAlgorithmException e){
			e.printStackTrace();
	//	} catch (UnsupportedEncodingException e) {
		//	e.printStackTrace();
		}
		
		return null;
	}
	//narazie testowo
	 public static String bytesToHex(byte[] b) {
	      char hexDigit[] = {'0', '1', '2', '3', '4', '5', '6', '7',
	                         '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
	      StringBuffer buf = new StringBuffer();
	      for (int j=0; j<b.length; j++) {
	         buf.append(hexDigit[(b[j] >> 4) & 0x0f]);
	         buf.append(hexDigit[b[j] & 0x0f]);
	      }
	      return buf.toString();
	   }
	

}
