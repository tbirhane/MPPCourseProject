package com.instagram.myInstagram.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
	
	/**During object creation of this class, this attribute is assigned to the singleton class UserService*/
	@Autowired
	private UserService userService;
	
	/**Get all elements*/
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return userService.getTopics();
	}
	/**Get the element with id = id*/
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return userService.getTopic(id);
	}
	/**Add a topic to topics*/
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void postTopic(@RequestBody Topic topic) {
		userService.add(topic);
	}
	/**Update a topic to in topics*/
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
		userService.updateTopic(id, topic);
	}
	
	/**Delete an id with id*/
	@RequestMapping(method=RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		 userService.deleteTopic(id);
	}
}
