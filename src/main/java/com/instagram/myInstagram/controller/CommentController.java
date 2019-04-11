package com.instagram.myInstagram.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.myInstagram.service.UserService;

@RestController
public class CommentController {
	
	/**During object creation of this class, this attribute is assigned to the singleton class UserService*/
	@Autowired
	private UserService userService;
	
//	/**Get all elements*/
//	@RequestMapping("/Comments")
//	public List<Comment> getAllComments() {
//		return userService.getComments();
//	}
//	/**Get the element with id = id*/
//	@RequestMapping("/Comments/{id}")
//	public Comment getComment(@PathVariable String id) {
//		return userService.getComment(id);
//	}
//	/**Add a Comment to Comments*/
//	@RequestMapping(method=RequestMethod.POST, value="/Comments")
//	public void postComment(@RequestBody Comment Comment) {
//		userService.add(Comment);
//	}
//	/**Update a Comment to in Comments*/
//	@RequestMapping(method=RequestMethod.PUT, value="/Comments/{id}")
//	public void updateComment(@PathVariable String id, @RequestBody Comment Comment) {
//		userService.updateComment(id, Comment);
//	}
//	
//	/**Delete an id with id*/
//	@RequestMapping(method=RequestMethod.DELETE, value = "/Comments/{id}")
//	public void deleteComment(@PathVariable String id) {
//		 userService.deleteComment(id);
//	}
}
