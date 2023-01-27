package com.newproject.Mysecondexample.survey;

import java.util.List;

import lombok.Data;

@Data
public class Question {

	private String id;
	private String description;
	private List<String> options;
	private String correctanswer;

	public Question(String id, String description, List<String> options, String correctanswer) {
		super();
		this.id = id;
		this.description = description;
		this.options = options;
		this.correctanswer = correctanswer;
	}
}
