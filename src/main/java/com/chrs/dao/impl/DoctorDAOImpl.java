package com.chrs.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.chrs.dao.DoctorDAO;
import com.chrs.entities.Doctor;
import com.chrs.entities.Location;
/**
 * 
 * @author saksham
 *
 */
public class DoctorDAOImpl extends HibernateDaoSupport implements DoctorDAO {

	public Doctor getDoctor(String name) {

		DetachedCriteria criteria = DetachedCriteria.forClass(Doctor.class);
		criteria.add(Restrictions.eq("name", name));

		List<?> list = getHibernateTemplate().findByCriteria(criteria);
		if (!list.isEmpty()) {
			return (Doctor) list.get(0);
		}
		return null;
	}

	public List<Doctor> getAllDoctors(Location location) {

		DetachedCriteria criteria = DetachedCriteria.forClass(Doctor.class);
		criteria.add(Restrictions.eq("location", location));
//		.createCriteria("rating").addOrder(Order.asc("totalRating"));
		List<Doctor> doctors = (List<Doctor>) getHibernateTemplate().findByCriteria(criteria);

		return doctors;
	}

	public Integer addDoctor(Doctor doctor) {

		return (Integer) getHibernateTemplate().save(doctor);
	}

	public Doctor getDoctor(Integer id) {
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Doctor.class);
		criteria.add(Restrictions.eq("id", id));
		
		List<?> list = getHibernateTemplate().findByCriteria(criteria);
		if (!list.isEmpty()) {
			return (Doctor) list.get(0);
		}
		return null;
	}

}
