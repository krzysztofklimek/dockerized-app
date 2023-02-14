package com.example.dockerizedapp.controller;

import com.example.dockerizedapp.dto.ColorDto;
import com.example.dockerizedapp.service.ColorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/color")
public class ColorController {

	ColorService colorService;

	@GetMapping("/all")
	public List<ColorDto> getAllUsers() {
		return colorService.findAll();
	}

	@GetMapping("/{colorId}")
	public ColorDto getUser(@PathVariable Long colorId) {
		return colorService.findById(colorId);
	}

	@PostMapping("/create-color")
	public void createUser(@RequestParam Long id, @RequestParam Long userId, @RequestParam String colorCode,
						   @RequestParam String colorName) {
		colorService.createColor(id, userId, colorCode, colorName);
	}
}