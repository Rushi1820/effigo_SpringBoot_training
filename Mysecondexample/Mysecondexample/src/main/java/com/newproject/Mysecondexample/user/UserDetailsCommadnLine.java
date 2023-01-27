package com.newproject.Mysecondexample.user;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsCommadnLine implements CommandLineRunner {

	public UserDetailsCommadnLine(UserDetailsRepository repository) {
		super();
		this.repository = repository;
	}

	private Logger logger = LoggerFactory.getLogger(getClass());

	private UserDetailsRepository repository;

	@Override
	public void run(String... args) throws Exception {
		//logger.info(Arrays.toString(args));
		repository.save(new UserDetails(1, "Rushi", "CSE"));
		repository.save(new UserDetails(2, "vardhan", "ECE"));
		repository.save(new UserDetails(3, "jay", "CSE"));

		//		java.util.List<UserDetails> users = repository.findAll();
		List<UserDetails> users = repository.findByBranch("CSE");
		users.forEach(user -> logger.info(user.toString()));
	}
}
