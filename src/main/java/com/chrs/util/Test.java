package com.chrs.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.chrs.entities.Doctor;
import com.chrs.entities.Location;

public class Test extends HibernateDaoSupport{

	public void save() {
		
		Location location = new Location();
		location.setName("Crossing Republik");
		
		//getHibernateTemplate().save(location);
		
		Doctor doctor = new Doctor();
		
		doctor.setAddress("galleria market");
		doctor.setContactNo("8585252522");
//		doctor.setField("ENT");
		doctor.setInTime("15:00");
		doctor.setOutTime("22:00");
		doctor.setLocation(location);
		doctor.setSalaryRange(1);
		
		getHibernateTemplate().save(doctor);
	}
	
	public static void main(String[] args) {
		 
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		//transaction.begin();
		Location location = new Location();
		location.setName("Crossing Republik");
		
	
		session.save(location);
		transaction.commit();
		//getHibernateTemplate().save(location);
		
		/*Doctor doctor = new Doctor();
		
		doctor.setAddress("galleria market");
		doctor.setContactNo("8585252522");
		doctor.setField("ENT");
		doctor.setInTime("15:00");
		doctor.setOutTime("22:00");
		doctor.setLocation(location);
		doctor.setSalaryRange(1);
		doctor.setName("doctor");
		
		
		transaction.commit();*/
		session.close();
		
	}
}
