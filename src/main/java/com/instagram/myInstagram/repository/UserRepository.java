package com.instagram.myInstagram.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.instagram.myInstagram.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
