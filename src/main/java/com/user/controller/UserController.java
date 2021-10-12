package com.user.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entities.User;
import com.user.services.UserService;
import com.user.entities.*;
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate resttemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") int userId)
	{
		User user= this.userService.getUser(userId);
		
		List<contact> list=this.resttemplate.getForObject("http://contact-service/contact/user/"+user.getUserId(),List.class);
		user.setContacts(list);
		return user;
		
	}
}
