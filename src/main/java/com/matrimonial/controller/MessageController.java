package com.matrimonial.controller;

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

import com.matrimonial.domain.Message;
import com.matrimonial.domain.User;
import com.matrimonial.service.MessageService;
import com.matrimonial.service.UserService;

@Controller
@RequestMapping("/messages")
public class MessageController {
	@Autowired
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Autowired
	private MessageService messageService;

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	
	@ModelAttribute("userList")
	public List<User> getUserList() {
		List<User> userList = userService.getAllUsers();
		return userList;
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String displayAllMessages(Model model) {
		// TODO: Get username of logged in user
		// TODO: Change method to getAllMessagesToUser
		User user = new User();
		user.setUsername("Computer");
		List<Message> messages = messageService.getAllMessagesFromUser(user);
		model.addAttribute("messages", messages);
		return "message/list";
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getMessageById(@PathVariable String id, Model model, RedirectAttributes ra) {
		Message message = messageService.getMessageById(id);
		if(message != null){
			model.addAttribute("message", message);
			return "message/show";
		}
		// TODO: Need to return 404 if message doesn't exist?
		return "redirect:/";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String displayMessageForm(Model model) {
		model.addAttribute(new Message());
		return "message/new";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String addMessageFromForm(@Valid Message message, BindingResult bindingResult, RedirectAttributes ra) {
		if (bindingResult.hasErrors()) {
			return "message/new";
		}
		
		message.setSentDate(new LocalDate());
		messageService.sendMessage(message);

		// Redirecting to avoid duplicate submission of the form
		return "redirect:/messages/" + message.getId();
	}
}