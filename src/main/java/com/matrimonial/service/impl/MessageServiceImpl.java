package com.matrimonial.service.impl;

import java.util.List;

import com.matrimonial.dao.MessageDao;
import com.matrimonial.domain.Message;
import com.matrimonial.domain.User;
import com.matrimonial.service.MessageService;

public class MessageServiceImpl implements MessageService
{
	private MessageDao messageDao;
	
	public void setMessageDao(MessageDao messageDao)
	{
		this.messageDao = messageDao;
	}
	
	@Override
	public void sendMessage(Message message) {
		messageDao.sendMessage(message);
	}

	@Override
	public Message getMessageById(String id) {
		return messageDao.getMessageById(id);
	}

	@Override
	public List<Message> getAllMessagesFromUser(User user) {
		return messageDao.getAllMessagesFromUser(user);
	}
	
	@Override
	public List<Message> getAllMessagesToUser(User user) {
		return messageDao.getAllMessagesToUser(user);
	}
	
	@Override
	public void updateMessage(Message message) {
		messageDao.updateMessage(message);
	}
}