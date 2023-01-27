package com.newproject.Mysecondexample.user;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface UserRestdetails extends PagingAndSortingRepository<UserDetails, Long> {
	List<UserDetails> findByBranch(String branch);
}
