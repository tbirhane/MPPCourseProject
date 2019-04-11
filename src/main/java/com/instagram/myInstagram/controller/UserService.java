package com.instagram.myInstagram.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "SpringMvc", "Java framewor"), 
			new Topic("Java", "SpringMvc", "Java framewor"), 
			new Topic("Hibernate", "SpringMvc", "Java framewor"))
			);
	
	public List<Topic> getTopics(){
		return topics;
	}
	public Topic getTopic(String id){
		return topics.stream().filter(x -> x.getId().equals(id)).findFirst().get();
	}
	public void add(Topic topic) {
		topics.add(topic);
	}
	public void updateTopic(String id, Topic topic) {
		for(int i = 0; i < topics.size(); i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}
	public void deleteTopic(String id) {
		topics.removeIf(x -> x.getId().equals(id));
	}
}
