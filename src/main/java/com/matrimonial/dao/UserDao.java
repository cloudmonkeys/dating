package com.matrimonial.dao;

import java.util.List;
import com.matrimonial.domain.User;

public interface UserDao 
{
	public void addUser(User user);

	public User getUserByUsername(String username);

	public List<User> getAllUsers();

	public void updateUserDetails(User user);
}