package com.in28min.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*http://localhost:8080/courses
[
 {
	 "id":1,
	 "name":"Learn AWS",
	 "author":"in28min"
 }
]*/
@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourrses() {
		return Arrays.asList(new Course(1, "Learn AWS", "in28min"), new Course(2, "Learn Nodejs", "in28min"),
				new Course(3, "learn java", "in28min"), new Course(4, "learn python", "in28min"));
	}

}
