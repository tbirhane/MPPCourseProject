package com.instagram.MyInstagram.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("Spring", "SpringMvc", "Java framewor"), 
				new Topic("Spring", "SpringMvc", "Java framewor"), 
				new Topic("Spring", "SpringMvc", "Java framewor"));
	}
}
