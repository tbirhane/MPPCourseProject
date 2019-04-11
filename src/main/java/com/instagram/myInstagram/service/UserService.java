package com.instagram.myInstagram.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.myInstagram.model.User;
import com.instagram.myInstagram.repository.UserRepository;



@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	private List<User> users = new ArrayList<>(Arrays.asList(
			new User("000 9232", "Joe", " Smith"), 
			new User("000 9456", "Abrham", " tola"), 
			new User("0008763", "Greck", "Hurry"))
			);
	
	public List<User> getusers(){
		//return users;
		List<User> user= new LinkedList<>();
		userRepository.findAll().forEach(users::add);
		return user;
	}
	public User getUser(String id){
		return users.stream().filter(x -> x.getId().equals(id)).findFirst().get();
	}
	public void add(User user) {
		//users.add(User);
		userRepository.save(user);
	}
	public void updateUser(String id, User User) {
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).getId().equals(id)) {
				users.set(i, User);
				return;
			}
		}
		
	}
	public void deleteUser(String id) {
		users.removeIf(x -> x.getId().equals(id));
	}
}
