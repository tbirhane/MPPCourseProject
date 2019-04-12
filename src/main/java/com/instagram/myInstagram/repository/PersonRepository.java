package com.instagram.myInstagram.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.instagram.myInstagram.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, String>{

}
