package com.validation.and.exception.validandexception.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "User_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class User {
	@Id
	@GeneratedValue
	private int userId;

	private String name;
	private String mail;
	private String phnum;
	private String nationality;
	private int age;
}
