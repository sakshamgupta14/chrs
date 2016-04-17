package com.chrs.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.chrs.dao.RatingDAO;
import com.chrs.entities.Doctor;
import com.chrs.entities.Rating;
/**
 * 
 * @author saksham
 *
 */
public class RatingDAOImpl extends HibernateDaoSupport implements RatingDAO{

	public Rating getRating(Doctor doctor) {
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Rating.class);
		criteria.add(Restrictions.eq("doctor", doctor));
		
		List<?> list = getHibernateTemplate().findByCriteria(criteria);
		if(!list.isEmpty()) {
			return (Rating) list.get(0);
		}
		return null;
	}

	
	public void saveOrUpdateRating(Rating rating) {
		
		getHibernateTemplate().saveOrUpdate(rating);
	}


	public Rating getRatingById(Integer id) {

		DetachedCriteria criteria = DetachedCriteria.forClass(Rating.class);
		criteria.add(Restrictions.eq("id", id));
		
		List<?> list = getHibernateTemplate().findByCriteria(criteria);
		if(!list.isEmpty()) {
			return (Rating) list.get(0);
		}
		else
			return null;
	}

}
