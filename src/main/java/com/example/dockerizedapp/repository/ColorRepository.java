package com.example.dockerizedapp.repository;

import com.example.dockerizedapp.document.Color;
import com.example.dockerizedapp.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ColorRepository extends MongoRepository<Color, Long> {

	Optional<Color> findById(Long id);

}
