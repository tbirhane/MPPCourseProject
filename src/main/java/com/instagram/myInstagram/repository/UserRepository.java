package com.instagram.myInstagram.repository;

import org.springframework.data.repository.CrudRepository;

import com.instagram.myInstagram.model.User;

public interface UserRepository extends CrudRepository<User, String> {

}
