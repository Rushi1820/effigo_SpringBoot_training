package com.newproject.Mysecondexample.survey;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SurveyResource {
	//http://localhost:8080/surveys/Survey1/questions/Question1
	String str = """
						{
			    "id": "Question1",
			    "description": "Most Popular Cloud Platform Today",
			    "options": [
			        "AWS",
			        "Azure",
			        "Google Cloud",
			        "Oracle Cloud"
			    ],
			    "correctanswer": "AWS"
			}

						""";
	private static String SPECIFIC_QUESTION_URL = "/surveys/Survey1/questions/Question1";
	@Autowired
	private TestRestTemplate template;

	@Test
	void retrieveSpecificSurveyQuestion_basicScenario() throws JSONException {
		ResponseEntity<String> responseEntity = template.getForEntity(SPECIFIC_QUESTION_URL, String.class);
		String expectedresponse = """
					{
				    "id": "Question1",
				    "description": "Most Popular Cloud Platform Today",
				    "options": [
				        "AWS",
				        "Azure",
				        "Google Cloud",
				        "Oracle Cloud"
				    ],
				    "correctanswer": "AWS"
				}

					""";
		JSONAssert.assertEquals(expectedresponse, responseEntity.getBody(), false);
		assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
		assertEquals("application/json", responseEntity.getHeaders().get("Content-Type").get(0));
		//assertEquals(expectedresponse.trim(), responseEntity.getBody());
		//System.out.println(responseEntity.getBody());
		//System.out.println(responseEntity.getHeaders());
	}
}
