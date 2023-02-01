package com.validation.and.exception.validandexception.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.validation.and.exception.validandexception.dto.UserRequest;
import com.validation.and.exception.validandexception.entity.User;
import com.validation.and.exception.validandexception.entity.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User saveUser(UserRequest userRequest) {
		User user = User.build(0, userRequest.getName(), userRequest.getMail(), userRequest.getPhnum(),
				userRequest.getNationality(), userRequest.getAge());
		return repository.save(user);
	}

	public List<User> getAllUsers() {
		return repository.findAll();
	}

	public User getUser(int id) {
		return repository.findByUserId(id);
	}

}
