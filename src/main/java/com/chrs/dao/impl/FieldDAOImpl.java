package com.chrs.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.chrs.dao.FieldDAO;
import com.chrs.entities.Field;

public class FieldDAOImpl extends HibernateDaoSupport implements FieldDAO {

	public Field getField(String name) {

		DetachedCriteria criteria = DetachedCriteria.forClass(Field.class);
		criteria.add(Restrictions.eq("name", name));

		List<?> list = getHibernateTemplate().findByCriteria(criteria);

		if (!list.isEmpty()) {
			return (Field) list.get(0);

		}
		return null;
	}

	public Integer addField(Field field) {
		return (Integer) getHibernateTemplate().save(field);
	}

	public List<Field> getAllFields() {

		DetachedCriteria criteria = DetachedCriteria.forClass(Field.class);
		List<Field> list = (List<Field>) getHibernateTemplate().findByCriteria(criteria);

		if (!list.isEmpty()) {
			return list;

		}
		return null;
	}

}
