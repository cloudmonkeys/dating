package com.matrimonial.dao.impl;

import com.matrimonial.dao.UserDao;
import com.matrimonial.domain.User;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Criteria;
import org.hibernate.criterion.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

@Repository
@Transactional(readOnly = true)
public class UserDaoHibernateImpl implements UserDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addUser(User user) {
		this.sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public User getUserByUsername(String username) {
		Criteria criteria = this.sessionFactory.getCurrentSession()
				.createCriteria(User.class);
		criteria.add(Restrictions.eq("username", username));
		return (User) criteria.uniqueResult();
	}

	@Override
	public List<User> getAllUsers() {
		return (List<User>) this.sessionFactory.getCurrentSession()
				.createCriteria(User.class).list();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void updateUserDetails(User user) {
		this.sessionFactory.getCurrentSession().update(user);
	}
}