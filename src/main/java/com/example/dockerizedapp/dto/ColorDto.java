package com.example.dockerizedapp.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class ColorDto {

	private final long id;
	private final long userId;
	private final String colorCode;
	private final String colorName;
}
