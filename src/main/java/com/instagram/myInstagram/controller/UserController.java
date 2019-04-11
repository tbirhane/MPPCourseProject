package com.instagram.myInstagram.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.myInstagram.model.User;
import com.instagram.myInstagram.service.UserService;

@RestController
public class UserController {
	
	/**During object creation of this class, this attribute is assigned to the singleton class UserService*/
	@Autowired
	private UserService userService;
	
	/**Get all elements*/
	@RequestMapping("/users/{id}/")
	public List<User> getAllUsers() {
		return userService.getUsers();
	}
	/**Get the element with id = id*/
	@RequestMapping("/users/{id}")
	public Optional<User> getUser(@PathVariable String id) {
		return userService.getUser(id);
	}
	/**Add a User to Users*/
	@RequestMapping(method=RequestMethod.POST, value="/users")
	public void postUser(@RequestBody User User) {
		userService.add(User);
	}
	/**Update a User to in Users*/
	@RequestMapping(method=RequestMethod.PUT, value="/users/{id}")
	public void updateUser(@PathVariable String id, @RequestBody User User) {
		userService.updateUser(id, User);
	}
	
	/**Delete an id with id*/
	@RequestMapping(method=RequestMethod.DELETE, value = "/users/{id}")
	public void deleteUser(@PathVariable String id) {
		 userService.deleteUser(id);
	}
}
