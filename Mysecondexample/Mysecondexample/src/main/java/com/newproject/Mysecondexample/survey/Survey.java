package com.newproject.Mysecondexample.survey;

import java.util.List;

import lombok.Data;

@Data
public class Survey {

	private String id;
	private String title;
	private String description;
	private List<Question> questions;

	public Survey(String id, String title, String description, List<Question> questions) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.questions = questions;
	}

}
