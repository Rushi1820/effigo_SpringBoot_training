package com.newproject.Mysecondexample.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserDetails {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String branch;

	public UserDetails() {
		super();
	}

	public UserDetails(long id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}

}
