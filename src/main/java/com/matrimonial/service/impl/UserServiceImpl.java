package com.matrimonial.service.impl;

import java.util.List;

import com.matrimonial.dao.UserDao;
import com.matrimonial.domain.User;
import com.matrimonial.service.UserService;

public class UserServiceImpl implements UserService
{
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}
	
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public User getUserByUsername(String username) {
		return userDao.getUserByUsername(username);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public void updateDetails(User user) {
		userDao.updateUserDetails(user);
	}
}