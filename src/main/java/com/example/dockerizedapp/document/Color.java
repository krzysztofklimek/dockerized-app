package com.example.dockerizedapp.document;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@Setter
@Document("color")
public class Color {

	@Id
	Long id;

	@Field(name="user_id")
	Long userId;

	String code;

	String name;

	public Color(Long id, Long userId, String code, String name) {
		this.id = id;
		this.userId = userId;
		this.code = code;
		this.name = name;
	}
}
