package com.example.dockerizedapp.service;

import com.example.dockerizedapp.dto.UserDto;
import com.example.dockerizedapp.entity.User;
import com.example.dockerizedapp.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {

	UserRepository userRepository;

	public void createUser(String userName, String userSurname) {
		userRepository.save(new User(userName, userSurname));
	}

	public List<UserDto> findAll(){
		return userRepository.findAll().stream()
				.map(u -> new UserDto(u.getName(), u.getSurname())).collect(Collectors.toList());
	}

	public UserDto findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		if (!user.isPresent()) {
			throw new RuntimeException();
		}
		return new UserDto(user.get().getName(), user.get().getSurname());
	}
}
