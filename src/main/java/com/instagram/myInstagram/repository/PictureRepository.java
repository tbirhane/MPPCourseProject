package com.instagram.myInstagram.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.instagram.myInstagram.model.Picture;

@Repository
public interface PictureRepository extends CrudRepository<Picture, String> {

}
