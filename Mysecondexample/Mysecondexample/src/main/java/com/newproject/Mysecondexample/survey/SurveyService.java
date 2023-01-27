package com.newproject.Mysecondexample.survey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class SurveyService {
	private static List<Survey> surveys = new ArrayList<>();

	static {
		Question question1 = new Question("Question1", "Most Popular Cloud Platform Today",
				Arrays.asList("AWS", "Azure", "Google Cloud", "Oracle Cloud"), "AWS");
		Question question2 = new Question("Question2", "Fastest Growing Cloud Platform",
				Arrays.asList("AWS", "Azure", "Google Cloud", "Oracle Cloud"), "Google Cloud");
		Question question3 = new Question("Question3", "Most Popular DevOps Tool",
				Arrays.asList("Kubernetes", "Docker", "Terraform", "Azure DevOps"), "Kubernetes");

		List<Question> questions = new ArrayList<>(Arrays.asList(question1, question2, question3));

		Survey survey = new Survey("Survey1", "My Favorite Survey", "Description of the Survey", questions);

		surveys.add(survey);

	}

	public List<Survey> retrieveALLSurveys() {
		return surveys;
	}

	public Survey retrieveSurveyById(String surveyId) {
		java.util.Optional<Survey> optionalsurvey = surveys.stream().filter(survey -> survey.getId().equals(surveyId))
				.findFirst();
		if ((optionalsurvey).isEmpty())
			return null;

		return optionalsurvey.get();
	}

	public List<Question> retrieveAllSurveyquestions(String surveyId) {
		Survey survey = retrieveSurveyById(surveyId);
		if (survey == null)
			return null;
		return survey.getQuestions();
	}

	public Question retrieveSpecificSurveyQuestion(String surveyId, String questionId) {
		List<Question> surveyQuestions = retrieveAllSurveyquestions(surveyId);
		if (surveyQuestions == null)
			return null;

		java.util.Optional<Question> optionalQuestion = surveyQuestions.stream()
				.filter(q -> q.getId().equalsIgnoreCase(questionId)).findFirst();
		if (optionalQuestion.isEmpty())
			return null;
		return optionalQuestion.get();
	}

	public void addNewSurveyquestions(String surveyId, Question question) {
		List<Question> questions = retrieveAllSurveyquestions(surveyId);
		questions.add(question);

	}

	public String deleteSurveyQuestion(String surveyId, String questionId) {
		List<Question> surveyQuestions = retrieveAllSurveyquestions(surveyId);
		if (surveyQuestions == null)
			return null;
		Predicate<? super Question> predicate = q -> q.getId().equalsIgnoreCase(questionId);
		boolean removed = surveyQuestions.removeIf(predicate);

		if (!removed)
			return null;

		return questionId;

	}

	public void updateSurveyQuestion(String surveyId, String questionId, Question question) {
		List<Question> questions = retrieveAllSurveyquestions(surveyId);
		questions.removeIf(q -> q.getId().equalsIgnoreCase(questionId));
		questions.add(question);

	}
}
