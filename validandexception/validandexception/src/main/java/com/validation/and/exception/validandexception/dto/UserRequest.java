package com.validation.and.exception.validandexception.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
	@NotNull(message = "name cant be null")
	private String name;
	@Email(message = "invalid email")
	private String mail;
	@NotNull
	@Pattern(regexp = "^\\d{10}", message = "invalid mobile number")
	private String phnum;
	@NotBlank
	private String nationality;
	@Min(18)
	@Max(80)
	private int age;

}
