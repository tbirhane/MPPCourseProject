package com.instagram.myInstagram.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.myInstagram.model.Person;
import com.instagram.myInstagram.service.PersonService;

@RestController
public class PersonController {
	/**During object creation of this class, this attribute is assigned to the singleton class PersonService*/
	@Autowired
	private PersonService personService;
	
	/**Get all elements*/
	@RequestMapping("/persons")
	public List<Person> getAllPersons() {
		return personService.getPersons();
	}
	/**Get the element with id = id*/
	@RequestMapping("/persons/{id}")
	public Optional<Person> getPerson(@PathVariable String id) {
		return personService.getPerson(id);
	}
	/**Add a Person to Persons*/
	@RequestMapping(method=RequestMethod.POST, value="/persons")
	public void postPerson(@RequestBody Person person) {
		personService.add(person);
	}
	/**Update a Person to in Persons*/
	@RequestMapping(method=RequestMethod.PUT, value="/persons/{id}")
	public void updatePerson(@PathVariable String id, @RequestBody Person person) {
		personService.updatePerson(id, person);
	}
	
	/**Delete an id with id*/
	@RequestMapping(method=RequestMethod.DELETE, value = "/persons/{id}")
	public void deletePerson(@PathVariable String id) {
		 personService.deletePerson(id);
	}
}
