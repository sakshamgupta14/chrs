package com.chrs.dao.impl;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import com.chrs.dao.UserDAO;
import com.chrs.entities.User;
/**
 * 
 * @author saksham
 *
 */
public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	public Integer saveUser(User user) {

		return (Integer) getHibernateTemplate().save(user);
	}

	public User getUser(String username) {

		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		criteria.add(Restrictions.eq("username", username));

		List<?> list = getHibernateTemplate().findByCriteria(criteria);

		if (!list.isEmpty()) {
			return (User) list.get(0);
		}

		return null;
	}

	public User getUser(String username, String password) {

		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		criteria.add(Restrictions.eq("username", username)).add(Restrictions.eq("password", password));

		List<?> list = getHibernateTemplate().findByCriteria(criteria);

		if (!list.isEmpty()) {
			return (User) list.get(0);
		}

		return null;
	}

}
