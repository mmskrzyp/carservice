package edu.pk.carservice.session;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;
		static {
			try {
				//sessionFactory = new Configuration().configure().buildSessionFactory();
				sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
				//ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().configure().buildServiceRegistry();
				//sessionFactory = new Configuration().configure().buildSessionFactory(serviceRegistry);
			} catch (HibernateException ex) {
				System.err.println("Initial SessionFactory creation failed." + ex);
				throw new ExceptionInInitializerError(ex);
			}
		}
		
		public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
