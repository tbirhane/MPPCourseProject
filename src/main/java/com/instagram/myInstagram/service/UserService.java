package com.instagram.myInstagram.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.myInstagram.model.User;
import com.instagram.myInstagram.repository.UserRepository;



@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
//	private List<User> users = new ArrayList<>(Arrays.asList(
//			new User("000 9232", "Joe", " Smith"), 
//			new User("000 9456", "Abrham", " tola"), 
//			new User("0008763", "Greck", "Hurry"))
//			);
//	
	public List<User> getUsers(){
		//return users;
		List<User> user= new LinkedList<>();
		userRepository.findAll().forEach(user::add);
		return user;
	}
	public Optional<User> getUser(String id){
		//return users.stream().filter(x -> x.getId().equals(id)).findFirst().get();
		return userRepository.findById(id);
	}
	public void add(User user) {
		//users.add(User);
		userRepository.save(user);
	}
	public void updateUser(String id, User user) {
//		for(int i = 0; i < users.size(); i++) {
//			if(users.get(i).getId().equals(id)) {
//				users.set(i, User);
//				return;
//			}
//		}
		userRepository.save(user);		
	}
	public void deleteUser(String id) {
		//users.removeIf(x -> x.getId().equals(id));
		userRepository.deleteById(id);
	}
}
