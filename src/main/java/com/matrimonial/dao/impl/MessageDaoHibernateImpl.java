package com.matrimonial.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.matrimonial.dao.MessageDao;
import com.matrimonial.domain.Message;
import com.matrimonial.domain.User;

@Repository
@Transactional(readOnly = true)
public class MessageDaoHibernateImpl implements MessageDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void sendMessage(Message message) {
		this.sessionFactory.getCurrentSession().save(message);
	}

	@Override
	public Message getMessageById(String id) {
		Criteria criteria = this.sessionFactory.getCurrentSession()
				.createCriteria(Message.class);
		criteria.add(Restrictions.eq("id", id));
		return (Message) criteria.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Message> getAllMessagesFromUser(User user) {
		Criteria criteria = this.sessionFactory.getCurrentSession()
				.createCriteria(Message.class);
		criteria.add(Restrictions.eq("fromUser", user.username));
		return (List<Message>) criteria.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Message> getAllMessagesToUser(User user) {
		Criteria criteria = this.sessionFactory.getCurrentSession()
				.createCriteria(Message.class);
		criteria.add(Restrictions.eq("toUser", user.username));
		return (List<Message>) criteria.list();
	}
}