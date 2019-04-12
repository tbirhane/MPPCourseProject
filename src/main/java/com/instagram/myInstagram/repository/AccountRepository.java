package com.instagram.myInstagram.repository;

import org.springframework.data.repository.CrudRepository;

import com.instagram.myInstagram.model.Account;
import com.instagram.myInstagram.model.Person;

public interface AccountRepository extends CrudRepository<Account,String>{
	//public Person findByPersonId(String id);
}
