package com.matrimonial.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.matrimonial.service.UserService;

@Controller
public class HomepageController {
	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/")
	public String showHomepage(Map<String, Object> model) {
		model.put("users", userService.getAllUsers());
		return "home";
	}
}