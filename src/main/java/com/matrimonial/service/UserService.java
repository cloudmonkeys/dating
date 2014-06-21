package com.matrimonial.service;

import java.util.List;
import com.matrimonial.domain.User;

public interface UserService
{
	public void addUser(User user);

	public User getUserByUsername(String username);

	public List<User> getAllUsers();

	public void updateDetails(User user);
}