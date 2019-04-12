package com.instagram.myInstagram.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.myInstagram.model.Person;
import com.instagram.myInstagram.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository PersonRepository;
	public List<Person> getPersons(){
		List<Person> Person= new LinkedList<>();
		PersonRepository.findAll().forEach(Person::add);
		return Person;
	}
	public Optional<Person> getPerson(String id){
		return PersonRepository.findById(id);
	}
	public void add(Person Person) {
		PersonRepository.save(Person);
	}
	public void updatePerson(String id, Person Person) {
		PersonRepository.save(Person);		
	}
	public void deletePerson(String id) {
		//Persons.removeIf(x -> x.getId().equals(id));
		PersonRepository.deleteById(id);
	}
}
