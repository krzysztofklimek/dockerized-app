package com.example.dockerizedapp.controller;

import com.example.dockerizedapp.dto.UserDto;
import com.example.dockerizedapp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

	UserService userService;

	@GetMapping()
	public List<UserDto> getAllUsers() {
		return userService.findAll();
	}

	@GetMapping("/{userId}")
	public UserDto getUser(@PathVariable Long userId) {
		return userService.findById(userId);
	}

	@PostMapping("/create-user")
	public void createUser(@RequestParam String userName, @RequestParam String userSurname){
		userService.createUser(userName, userSurname);
	}
}
