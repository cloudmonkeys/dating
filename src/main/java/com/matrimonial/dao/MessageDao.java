package com.matrimonial.dao;

import java.util.List;

import com.matrimonial.domain.Message;
import com.matrimonial.domain.User;

public interface MessageDao 
{
	public void sendMessage(Message message);

	public Message getMessageById(String id);

	public List<Message> getAllMessagesFromUser(User user);
	
	public List<Message> getAllMessagesToUser(User user);
}