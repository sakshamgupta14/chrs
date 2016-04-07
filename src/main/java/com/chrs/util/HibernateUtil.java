package com.chrs.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chrs.entities.Doctor;
/**
 * 
 * @author saksham
 *
 */
public class HibernateUtil {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Doctor doctor = new Doctor();
		doctor.setName("name");
		
		transaction.commit();
		session.close();
		
	}
}
