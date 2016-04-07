package com.chrs.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.chrs.dao.LocationDAO;
import com.chrs.entities.Location;

public class LocationDAOImpl extends HibernateDaoSupport implements LocationDAO{

	public Location getLocation(String name) {
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Location.class);
		criteria.add(Restrictions.eq("name", name));
		
		List<?> list = getHibernateTemplate().findByCriteria(criteria);
		if(!list.isEmpty()) {
			return (Location) list.get(0);
		}
		return null;
	}

}
