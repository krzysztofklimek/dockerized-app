package com.example.dockerizedapp.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@Getter
@Setter
//@NoArgsConstructor if final fields presented in class, no args constructor not allowed
@AllArgsConstructor
@RequiredArgsConstructor
public class UserDto {

	private final String name;
	private final String surname;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<String> colors;
}
