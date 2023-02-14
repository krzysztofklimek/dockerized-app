package com.example.dockerizedapp.repository;

import com.example.dockerizedapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findById(Long id);

}
