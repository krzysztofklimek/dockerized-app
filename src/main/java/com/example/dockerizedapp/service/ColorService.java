package com.example.dockerizedapp.service;

import com.example.dockerizedapp.document.Color;
import com.example.dockerizedapp.dto.ColorDto;
import com.example.dockerizedapp.dto.UserDto;
import com.example.dockerizedapp.entity.User;
import com.example.dockerizedapp.repository.ColorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ColorService {

	ColorRepository colorRepository;

	public void createColor(Long id, Long userId, String colorCode, String colorName) {
		colorRepository.save(new Color(id, userId, colorCode, colorName));
	}

	public List<ColorDto> findAll(){
		return colorRepository.findAll().stream()
				.map(c -> new ColorDto(c.getId(), c.getUserId(), c.getCode(), c.getName())).collect(Collectors.toList());
	}

	public ColorDto findById(Long id) {
		Optional<Color> color = colorRepository.findById(id);
		if (!color.isPresent()) {
			throw new RuntimeException();
		}
		return new ColorDto(color.get().getId(), color.get().getUserId(), color.get().getCode(), color.get().getName());
	}
}
