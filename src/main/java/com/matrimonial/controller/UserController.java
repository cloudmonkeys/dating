package com.matrimonial.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.matrimonial.domain.User;
import com.matrimonial.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	public void setEmployeeService(UserService userService) {
		this.userService = userService;
	}

	@ModelAttribute("profileForList")
	public List<String> getProfileForList() {
		List<String> profileForList = new ArrayList<String>();
		profileForList.add("Please select");
		profileForList.add("Self");
		profileForList.add("Brother");
		profileForList.add("Sister");
		return profileForList;
	}

	@ModelAttribute("ethnicityList")
	public List<String> getEthnicityList() {
		List<String> ethnicityList = new ArrayList<String>();
		ethnicityList.add("Please select");
		ethnicityList.add("Pakistani");
		ethnicityList.add("Indian");
		ethnicityList.add("Bengali");
		ethnicityList.add("Arab");
		return ethnicityList;
	}

	@ModelAttribute("religiousSectList")
	public List<String> getReligiousSectList() {
		List<String> religiousSectList = new ArrayList<String>();
		religiousSectList.add("Please select");
		religiousSectList.add("Sunni - Hanafi");
		religiousSectList.add("Sunni - Maliki");
		religiousSectList.add("Sunni - Shafii");
		religiousSectList.add("Sunni - Hanbali");
		religiousSectList.add("Shia");
		religiousSectList.add("Sufi");
		return religiousSectList;
	}

	@ModelAttribute("communityLanguageList")
	public List<String> getCommunityLanguageList() {
		List<String> communityLanguageList = new ArrayList<String>();
		communityLanguageList.add("Please select");
		communityLanguageList.add("Urdu");
		communityLanguageList.add("Punjabi");
		communityLanguageList.add("Gujurati");
		communityLanguageList.add("Bengali");
		communityLanguageList.add("Arabic");
		return communityLanguageList;
	}

	@ModelAttribute("whereDidYouHearAboutUsList")
	public List<String> getWhereDidYouHearAboutUsList() {
		List<String> whereDidYouHearAboutUsList = new ArrayList<String>();
		whereDidYouHearAboutUsList.add("Please select");
		whereDidYouHearAboutUsList.add("Friend or family");
		whereDidYouHearAboutUsList.add("Magazine ad");
		whereDidYouHearAboutUsList.add("TV advert");
		whereDidYouHearAboutUsList.add("Radio");
		whereDidYouHearAboutUsList.add("Community leader/Imam");
		return whereDidYouHearAboutUsList;
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String displayUserForm(Model model) {
		model.addAttribute(new User());
		return "user/register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String addUserFromForm(@Valid User user, BindingResult bindingResult, RedirectAttributes ra) {
		if (bindingResult.hasErrors()) {
			return "user/register";
		}
		user.setJoinDate(new LocalDate());
		// TODO: Need to hash the password here and save that to the DB
		userService.addUser(user);

		// Redirecting to avoid duplicate submission of the form
		return "redirect:/user/" + user.getUsername();
	}

	@RequestMapping(value = "/{username}", method = RequestMethod.GET)
	public String showUserProfile(@PathVariable String username, Model model, RedirectAttributes ra) {
		User user = userService.getUserByUsername(username);
		if(user != null){
			model.addAttribute("user", user);
			return "user/profile";
		}
		// TODO: Need to return 404 if user doesn't exist?
		return "redirect:/";
	}
}