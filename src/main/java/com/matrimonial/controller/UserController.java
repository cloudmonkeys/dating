package com.matrimonial.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

import org.springframework.ui.Model;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;

import com.matrimonial.domain.User;
import com.matrimonial.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController
{
	private UserService userService;

	@Inject
	public void setEmployeeService(UserService userService)
	{
		this.userService = userService;
	}

	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String displayUserForm(Model model)
	{
		
		//Will probably load all of these from a properties file when ready to go live so easy to add/remove
		model.addAttribute(new User());
		
		List<String> profileForList = new ArrayList<String>();
		profileForList.add("Please select");
		profileForList.add("Self");
		profileForList.add("Brother");
		profileForList.add("Sister");
		
		List<String> ethnicityList = new ArrayList<String>();
		ethnicityList.add("Please select");
		ethnicityList.add("Pakistani");
		ethnicityList.add("Indian");
		ethnicityList.add("Bengali");
		ethnicityList.add("Arab");
		
		List<String> religiousSectList = new ArrayList<String>();
		religiousSectList.add("Please select");
		religiousSectList.add("Sunni - Hanafi");
		religiousSectList.add("Sunni - Maliki");
		religiousSectList.add("Sunni - Shafii");
		religiousSectList.add("Sunni - Hanbali");
		religiousSectList.add("Shia");
		religiousSectList.add("Sufi");
		
		List<String> communityLanguageList = new ArrayList<String>();
		communityLanguageList.add("Please select");
		communityLanguageList.add("Urdu");
		communityLanguageList.add("Punjabi");
		communityLanguageList.add("Gujurati");
		communityLanguageList.add("Bengali");
		communityLanguageList.add("Arabic");
		
		List<String> whereDidYouHearAboutUsList = new ArrayList<String>();
		whereDidYouHearAboutUsList.add("Please select");
		whereDidYouHearAboutUsList.add("Friend or family");
		whereDidYouHearAboutUsList.add("Magazine ad");
		whereDidYouHearAboutUsList.add("TV advert");
		whereDidYouHearAboutUsList.add("Radio");
		whereDidYouHearAboutUsList.add("Community leader/Imam");
		
		model.addAttribute("profileForList", profileForList);
		model.addAttribute("ethnicityList", ethnicityList);
		model.addAttribute("religiousSectList", religiousSectList);
		model.addAttribute("communityLanguageList", communityLanguageList);
		model.addAttribute("whereDidYouHearAboutUsList", whereDidYouHearAboutUsList);
		
		return "user/register";
	}

	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String addUserFromForm(@Valid User user, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			return "user/edit";
		}
		userService.addUser(user);

		//Redirecting to avoid duplicate submission of the form
		return "redirect:/users/" + user.getUsername();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String loginUser(@Valid User user, BindingResult bindingResult)
	{
		return null;
	}
}